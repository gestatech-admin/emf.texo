package org.eclipse.emf.texo.test.model.samples.forum;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

/**
 * A representation of the model object '<em><b>Member</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "Member")
public class Member {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String nickname = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, targetEntity = Post.class)
  @OrderColumn()
  @JoinTable(name = "Member_posts")
  private List<Post> posts = new ArrayList<Post>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, targetEntity = Topic.class)
  @OrderColumn()
  @JoinTable(name = "Member_created")
  private List<Topic> created = new ArrayList<Topic>();

  /**
   * Returns the value of '<em><b>nickname</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>nickname</b></em>' feature
   * @generated
   */
  public String getNickname() {
    return nickname;
  }

  /**
   * Sets the '{@link Member#getNickname() <em>nickname</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Member#getNickname() nickname}' feature.
   * @generated
   */
  public void setNickname(String newNickname) {
    nickname = newNickname;
  }

  /**
   * Returns the value of '<em><b>posts</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>posts</b></em>' feature
   * @generated
   */
  public List<Post> getPosts() {
    return posts;
  }

  /**
   * Adds to the <em>posts</em> feature.
   * 
   * @generated
   */
  public void addToPosts(Post postsValue) {
    if (!posts.contains(postsValue)) {

      posts.add(postsValue);
    }

  }

  /**
   * Removes from the <em>posts</em> feature.
   * 
   * @generated
   */
  public void removeFromPosts(Post postsValue) {
    if (posts.contains(postsValue)) {
      posts.remove(postsValue);
    }
  }

  /**
   * Clears the <em>posts</em> feature.
   * 
   * @generated
   */
  public void clearPosts() {
    while (!posts.isEmpty()) {
      removeFromPosts(posts.iterator().next());
    }
  }

  /**
   * Sets the '{@link Member#getPosts() <em>posts</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Member#getPosts() posts}' feature.
   * @generated
   */
  public void setPosts(List<Post> newPosts) {
    posts = newPosts;
  }

  /**
   * Returns the value of '<em><b>created</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>created</b></em>' feature
   * @generated
   */
  public List<Topic> getCreated() {
    return created;
  }

  /**
   * Adds to the <em>created</em> feature.
   * 
   * @generated
   */
  public void addToCreated(Topic createdValue) {
    if (!created.contains(createdValue)) {

      created.add(createdValue);
    }

  }

  /**
   * Removes from the <em>created</em> feature.
   * 
   * @generated
   */
  public void removeFromCreated(Topic createdValue) {
    if (created.contains(createdValue)) {
      created.remove(createdValue);
    }
  }

  /**
   * Clears the <em>created</em> feature.
   * 
   * @generated
   */
  public void clearCreated() {
    while (!created.isEmpty()) {
      removeFromCreated(created.iterator().next());
    }
  }

  /**
   * Sets the '{@link Member#getCreated() <em>created</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Member#getCreated() created}' feature.
   * @generated
   */
  public void setCreated(List<Topic> newCreated) {
    created = newCreated;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Member " + " [nickname: " + getNickname() + "]";
  }
}
