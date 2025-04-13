import java.util.*;

public class SocialMediaApp {
    Scanner sc = new Scanner(System.in);
    ArrayList<User> users = new ArrayList<>();
    User currentUser = null;

    public static void main(String[] args) {
        SocialMediaApp app = new SocialMediaApp();
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
        System.out.println("Account created");
    }

    void login() {
        System.out.print("Username: ");
        String name = sc.nextLine();
        System.out.print("Password: ");
        String pass = sc.nextLine();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).username.equals(name) && users.get(i).password.equals(pass)) {
                currentUser = users.get(i);
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
        for (int i = 0; i < currentUser.posts.size(); i++) {
            if (currentUser.posts.get(i).postId.equals(id)) {
                System.out.print("New Text: ");
                currentUser.posts.get(i).text = sc.nextLine();
                System.out.println("Post updated.");
                return;
            }
        }
        System.out.println("Post not found");
    }

    void deletePost() {
        System.out.print("Post ID:");
        String id = sc.nextLine();
        for (int i = 0; i < currentUser.posts.size(); i++) {
            if (currentUser.posts.get(i).postId.equals(id)) {
                currentUser.posts.remove(i);
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
        for (int i = 0; i < users.size(); i++) {
            User u = users.get(i);
            for (int j = 0; j < u.posts.size(); j++) {
                if (u.posts.get(j).postId.equals(pid)) {
                    u.posts.get(j).comments.add(new Comment(cid, currentUser.userId, text));
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
            for (int i = 0; i < users.size(); i++) {
                for (int j = 0; j < users.get(i).posts.size(); j++) {
                    Post p = users.get(i).posts.get(j);
                    if (p.postId.equals(pid)) {
                        if (!p.likes.contains(currentUser.userId)) {
                            p.likes.add(currentUser.userId);
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
        for (int i = 0; i < users.size(); i++) {
            for (int j = 0; j < users.get(i).posts.size(); j++) {
                Post p = users.get(i).posts.get(j);
                for (int k = 0; k < p.comments.size(); k++) {
                    Comment c = p.comments.get(k);
                    if (c.commentId.equals(cid) && c.userId.equals(currentUser.userId)) {
                        p.comments.remove(k);
                        System.out.println("Comment deleted");
                        return;
                    }
                }
            }
        }
        System.out.println("Comment not found");
    }

    void showFeed() {
        for (int i = 0; i < users.size(); i++) {
            User u = users.get(i);
            for (int j = 0; j < u.posts.size(); j++) {
                Post p = u.posts.get(j);
                System.out.println("User: " + u.username);
                System.out.println("Post ID: " + p.postId);
                System.out.println("Text: " + p.text);
                System.out.println("Likes: " + p.likes.size());
                System.out.println("Comments:");
                for (int k = 0; k < p.comments.size(); k++) {
                    Comment c = p.comments.get(k);
                    System.out.println(" - " + c.userId + ": " + c.text);
                }
            }
        }
    }
}
