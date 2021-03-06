package Estructuras.Arboles;

<<<<<<< HEAD

=======
import Estructuras.Arboles.AVLNode;
>>>>>>> 39045b59da63fcad88d0438a0ebb67986d8c1114

public class AVLNode<T extends Comparable<T>>
{
  public T data;
  public int balanceFactor;
  public AVLNode<T> left;
  public AVLNode<T> right;
  
  public AVLNode() {}
  
  public AVLNode(T data)
  {
    this.data = data;
    balanceFactor = 0;
    left = null;
    right = null;
  }
  
  public T getData() {
    return data;
  }
  
  public void setData(T data) {
    this.data = data;
  }
  
  public int getBalanceFactor() {
    return balanceFactor;
  }
  
  public void setBalanceFactor(int balanceFactor) {
    this.balanceFactor = balanceFactor;
  }
  
  public AVLNode<T> getLeft() {
    return left;
  }
  
  public void setLeft(AVLNode<T> left) {
    this.left = left;
  }
  
  public AVLNode<T> getRight() {
    return right;
  }
  
  public void setRight(AVLNode<T> right) {
    this.right = right;
  }
}