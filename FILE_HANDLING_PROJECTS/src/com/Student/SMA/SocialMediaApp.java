package com.Student.SMA;

import java.io.*;
import java.util.*;

public class SocialMediaApp {
    Scanner sc = new Scanner(System.in);
    ArrayList<User> users = new ArrayList<>();
    User currentUser = null;
    String filePath = "social_media_data.txt";

    public static void main(String[] args) {
        SocialMediaApp app = new SocialMediaApp();
        app.loadUsers();
        app.mainMenu();
    }

    void mainMenu() {
        while (true) {
            System.out.println("****************Welcome to Social Media****************");
            System.out.println("1 - Create Account");
            System.out.println("2 - Login");
            System.out.println("3 - Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                createAccount();
            } else if (choice == 2) {
                login();
            } else if (choice == 3) {
                saveUsers();
                System.out.println("Goodbye");
                break;
            } else {
                System.out.println("Invalid option");
            }
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
        saveUsers();
        System.out.println("Account created");
    }

    void login() {
        System.out.print("Username: ");
        String name = sc.nextLine();
        System.out.print("Password: ");
        String pass = sc.nextLine();
        for (User user : users) {
            if (user.username.equals(name) && user.password.equals(pass)) {
                currentUser = user;
                System.out.println("Login successful!");
                userMenu();
                return;
            }
        }
        System.out.println("Invalid username or password");
    }

    void userMenu() {
        while (true) {
            System.out.println("1 - Update Account");
            System.out.println("2 - Add Post");
            System.out.println("3 - Update Post");
            System.out.println("4 - Delete Post");
            System.out.println("5 - Comment on Post");
            System.out.println("6 - Like Post");
            System.out.println("7 - Delete Comment");
            System.out.println("8 - Show Feed");
            System.out.println("9 - Logout");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                updateAccount();
            } else if (choice == 2) {
                addPost();
            } else if (choice == 3) {
                updatePost();
            } else if (choice == 4) {
                deletePost();
            } else if (choice == 5) {
                commentOnPost();
            } else if (choice == 6) {
                likePost();
            } else if (choice == 7) {
                deleteComment();
            } else if (choice == 8) {
                showFeed();
            } else if (choice == 9) {
                currentUser = null;
                System.out.println("Logged out");
                break;
            } else {
                System.out.println("Invalid choice");
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
        saveUsers();  // Save updated data to file
    }

    void addPost() {
        System.out.print("Post ID: ");
        String id = sc.nextLine();
        System.out.print("Post Text: ");
        String text = sc.nextLine();
        currentUser.posts.add(new Post(id, text));
        saveUsers();  // Save data after adding a post
        System.out.println("Post added.");
    }

    void updatePost() {
        System.out.print("Post ID: ");
        String id = sc.nextLine();
        for (Post post : currentUser.posts) {
            if (post.postId.equals(id)) {
                System.out.print("New Text: ");
                post.text = sc.nextLine();
                saveUsers();
                System.out.println("Post updated.");
                return;
            }
        }
        System.out.println("Post not found");
    }

    void deletePost() {
        System.out.print("Post ID: ");
        String id = sc.nextLine();
        for (int i = 0; i < currentUser.posts.size(); i++) {
            if (currentUser.posts.get(i).postId.equals(id)) {
                currentUser.posts.remove(i);
                saveUsers();
                System.out.println("Post deleted");
                return;
            }
        }
        System.out.println("Post not found");
    }

    void commentOnPost() {
        System.out.print("Post ID: ");
        String pid = sc.nextLine();
        System.out.print("Comment ID: ");
        String cid = sc.nextLine();
        System.out.print("Comment Text: ");
        String text = sc.nextLine();
        for (User u : users) {
            for (Post p : u.posts) {
                if (p.postId.equals(pid)) {
                    p.comments.add(new Comment(cid, currentUser.userId, text));
                    saveUsers();  // Save data after commenting
                    System.out.println("Comment added");
                    return;
                }
            }
        }
        System.out.println("Post not found");
    }

    void likePost() {
        System.out.print("Post ID: ");
        String pid = sc.nextLine();
        System.out.print("Do you like this post? (yes/no): ");
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            for (User u : users) {
                for (Post p : u.posts) {
                    if (p.postId.equals(pid)) {
                        if (!p.likes.contains(currentUser.userId)) {
                            p.likes.add(currentUser.userId);
                            saveUsers();
                            System.out.println("Post liked");
                        } else {
                            System.out.println("You already liked this post");
                        }
                        return;
                    }
                }
            }
        } else {
            System.out.println("Like skipped");
        }
    }

    void deleteComment() {
        System.out.print("Post ID: ");
        String pid = sc.nextLine();
        System.out.print("Comment ID: ");
        String cid = sc.nextLine();
        for (User u : users) {
            for (Post p : u.posts) {
                for (int k = 0; k < p.comments.size(); k++) {
                    Comment c = p.comments.get(k);
                    if (c.commentId.equals(cid) && c.userId.equals(currentUser.userId)) {
                        p.comments.remove(k);
                        saveUsers();
                        System.out.println("Comment deleted");
                        return;
                    }
                }
            }
        }
        System.out.println("Comment not found");
    }

    void showFeed() {
        for (User u : users) {
            for (Post p : u.posts) {
                System.out.println("User: " + u.username);
                System.out.println("Post ID: " + p.postId);
                System.out.println("Text: " + p.text);
                System.out.println("Likes: " + p.likes.size());
                System.out.println("Comments:");
                for (Comment c : p.comments) {
                    System.out.println(" - " + c.userId + ": " + c.text);
                }
            }
        }
    }


    void saveUsers() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (User user : users) {
                writer.write(user.userId + "," + user.username + "," + user.email + "," + user.contact + "," + user.password);
                writer.newLine();
                for (Post post : user.posts) {
                    writer.write("  " + post.postId + "," + post.text);  // Post data
                    writer.newLine();
                    for (Comment comment : post.comments) {
                        writer.write("    " + comment.commentId + "," + comment.userId + "," + comment.text);  // Comment data
                        writer.newLine();
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    void loadUsers() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userData = line.split(",");
                String userId = userData[0];
                String username = userData[1];
                String email = userData[2];
                String contact = userData[3];
                String password = userData[4];
                User user = new User(userId, username, email, contact, password);
                while ((line = reader.readLine()) != null && line.startsWith("  ")) {
                    String[] postData = line.trim().split(",");
                    String postId = postData[0];
                    String text = postData[1];
                    Post post = new Post(postId, text);
                    while ((line = reader.readLine()) != null && line.startsWith("    ")) {
                        String[] commentData = line.trim().split(",");
                        String commentId = commentData[0];
                        String userIdComment = commentData[1];
                        String commentText = commentData[2];
                        post.comments.add(new Comment(commentId, userIdComment, commentText));
                    }
                    user.posts.add(post);
                }
                users.add(user);
            }
        } catch (IOException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }
}

