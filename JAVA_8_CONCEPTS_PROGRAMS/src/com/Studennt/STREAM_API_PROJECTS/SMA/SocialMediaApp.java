package com.Studennt.STREAM_API_PROJECTS.SMA;

import java.util.*;
import java.util.*;

public class SocialMediaApp {
    Scanner sc = new Scanner(System.in);
    ArrayList<User> users = new ArrayList<>();
    User currentUser = null;

    public static void main(String[] args) {
        new SocialMediaApp().mainMenu();
    }

    void mainMenu() {
        while (true) {
            System.out.println("********* Welcome to Social Media *********");
            System.out.println("1 - Create Account\n2 - Login\n3 - Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt(); sc.nextLine();

            if (choice == 1) createAccount();
            else if (choice == 2) login();
            else if (choice == 3) break;
            else System.out.println("Invalid option");
        }
    }

    void createAccount() {
        System.out.print("User ID: ");
        String id = sc.nextLine();
        System.out.print("Username: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Contact: ");
        String contact = sc.nextLine();
        System.out.print("Password: ");
        String pass = sc.nextLine();
        users.add(new User(id, name, email, contact, pass));
        System.out.println("Account created");
    }

    void login() {
        System.out.print("Username: ");
        String name = sc.nextLine();
        System.out.print("Password: ");
        String pass = sc.nextLine();

        Optional<User> match = users.stream()
                .filter(u -> u.username.equals(name) && u.password.equals(pass))
                .findFirst();

        if (match.isPresent()) {
            currentUser = match.get();
            System.out.println("Login successful");
            userMenu();
        } else {
            System.out.println("Invalid username or password");
        }
    }

    void userMenu() {
        while (true) {
            System.out.println("1 - Update Account\n2 - Add Post\n3 - Update Post\n4 - Delete Post\n5 - Comment\n6 - Like\n7 - Delete Comment\n8 - Show Feed\n9 - Logout");
            System.out.print("Choice: ");
            int choice = sc.nextInt(); sc.nextLine();
            switch (choice) {
                case 1 -> updateAccount();
                case 2 -> addPost();
                case 3 -> updatePost();
                case 4 -> deletePost();
                case 5 -> commentOnPost();
                case 6 -> likePost();
                case 7 -> deleteComment();
                case 8 -> showFeed();
                case 9 -> { currentUser = null; return; }
                default -> System.out.println("Invalid choice");
            }
        }
    }

    void updateAccount() {
        System.out.print("New Username: ");
        currentUser.username = sc.nextLine();
        System.out.print("New Email: ");
        currentUser.email = sc.nextLine();
        System.out.print("New Contact: ");
        currentUser.contact = sc.nextLine();
        System.out.print("New Password: ");
        currentUser.password = sc.nextLine();
        System.out.println("Account updated.");
    }

    void addPost() {
        System.out.print("Post ID: ");
        String id = sc.nextLine();
        System.out.print("Post Text: ");
        String text = sc.nextLine();
        currentUser.posts.add(new Post(id, text));
        System.out.println("Post added.");
    }

    void updatePost() {
        System.out.print("Post ID: ");
        String id = sc.nextLine();

        currentUser.posts.stream()
                .filter(p -> p.postId.equals(id))
                .findFirst()
                .ifPresentOrElse(
                        p -> {
                            System.out.print("New Text: ");
                            p.text = sc.nextLine();
                            System.out.println("Post updated.");
                        },
                        () -> System.out.println("Post not found")
                );
    }

    void deletePost() {
        System.out.print("Post ID: ");
        String id = sc.nextLine();
        boolean removed = currentUser.posts.removeIf(p -> p.postId.equals(id));
        System.out.println(removed ? "Post deleted" : "Post not found");
    }

    void commentOnPost() {
        System.out.print("Post ID: ");
        String pid = sc.nextLine();
        System.out.print("Comment ID: ");
        String cid = sc.nextLine();
        System.out.print("Comment Text: ");
        String text = sc.nextLine();

        users.stream()
                .flatMap(u -> u.posts.stream())
                .filter(p -> p.postId.equals(pid))
                .findFirst()
                .ifPresentOrElse(
                        p -> {
                            p.comments.add(new Comment(cid, currentUser.userId, text));
                            System.out.println("Comment added");
                        },
                        () -> System.out.println("Post not found")
                );
    }

    void likePost() {
        System.out.print("Post ID: ");
        String pid = sc.nextLine();
        System.out.print("Do you like this post? (yes/no): ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            users.stream()
                    .flatMap(u -> u.posts.stream())
                    .filter(p -> p.postId.equals(pid))
                    .findFirst()
                    .ifPresentOrElse(
                            p -> {
                                if (!p.likes.contains(currentUser.userId)) {
                                    p.likes.add(currentUser.userId);
                                    System.out.println("Post liked");
                                } else {
                                    System.out.println("You already liked this post");
                                }
                            },
                            () -> System.out.println("Post not found")
                    );
        } else {
            System.out.println("Like skipped");
        }
    }

    void deleteComment() {
        System.out.print("Post ID: ");
        String pid = sc.nextLine();
        System.out.print("Comment ID: ");
        String cid = sc.nextLine();

        users.stream()
                .flatMap(u -> u.posts.stream())
                .filter(p -> p.postId.equals(pid))
                .findFirst()
                .ifPresentOrElse(
                        p -> {
                            boolean removed = p.comments.removeIf(c -> c.commentId.equals(cid) && c.userId.equals(currentUser.userId));
                            System.out.println(removed ? "Comment deleted" : "Comment not found");
                        },
                        () -> System.out.println("Post not found")
                );
    }

    void showFeed() {
        users.stream().forEach(u -> {
            u.posts.stream().forEach(p -> {
                System.out.println("User: " + u.username);
                System.out.println("Post ID: " + p.postId);
                System.out.println("Text: " + p.text);
                System.out.println("Likes: " + p.likes.size());
                System.out.println("Comments:");
                p.comments.stream().forEach(c -> {
                    System.out.println(" - " + c.userId + ": " + c.text);
                });
            });
        });
    }
}

