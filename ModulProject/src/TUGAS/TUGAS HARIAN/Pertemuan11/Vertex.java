package Pertemuan11;

public class Vertex {
  private char label;
  private boolean wasVisited;

  public Vertex(char label) {
    label = label;
    wasVisited = false;
  }

  public char getLabel() {
    return label;
  }

  public void setLabel(char label) {
    this.label = label;
  }

  public boolean isWasVisited() {
    return wasVisited;
  }

  public void setWasVisited(boolean wasVisited) {
    this.wasVisited = wasVisited;
  }
}
