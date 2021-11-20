package lab6;

public class TipColl {
    public void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("4","3","5","c","1","6","5","t");
        list.print();
        list.remove(5);
        list.print();
        list.remove("7");
        list.print();
        System.out.println(list.get(3));
        list.clear();
        list.add("1","3","5","a");
        list.print();
    }
    public class MyArrayList<E> {
        private Node<E> firstNode;
        private Node<E> lastNode;
        private int size = 0;
        public MyArrayList(){
            lastNode = new Node<E> (null,null);
            firstNode = new Node<E> (null,lastNode);
        }
        public int size(){
            return size;
        }
        public void add(E item){
            if (firstNode.getCurrentElement()==null){
                firstNode.setCurrentElement(item);
            } else {
                Node<E> prev = lastNode;
                prev.setCurrentElement(item);
                lastNode = new Node<E> (item, null);
                prev.setNextElement(lastNode);
                size++;
            }
        }
        public void add(E... item){
            for (E args : item){
                add(args);
            }
        }
        public void remove(int index){
            Node<E> target = firstNode;
            if (index == 1){
                firstNode=firstNode.getNextElement();
            } else {
                for (int i = 0; i<index-1; i++){
                    target = target.getNextElement();
                }
                target.setNextElement(target.getNextElement().getNextElement());
            }
            size--;
        }
        public void remove(E item){
            Node<E> target = firstNode;
            Node<E> prevTarget = target;
            int i = 0;
            while (i<=size){
                if (target.getCurrentElement() == item){
                    if (target.getCurrentElement() == firstNode.getCurrentElement()) {
                        firstNode.setNextElement(firstNode.nextElement.nextElement);
                        firstNode.setCurrentElement(firstNode.getNextElement().getCurrentElement());
                    } else {
                        prevTarget.setNextElement(prevTarget.getNextElement().getNextElement());
                    }
                    size--;
                }
                prevTarget = target;
                target = target.getNextElement();
                i++;
            }
        }
        public E get(int index){
            Node<E> target = firstNode;
            for (int i = 0; i<index-1; i++){
                target = target.getNextElement();
            }
            return target.getCurrentElement();
        }
        public void clear(){
            lastNode = new Node<E> (null,null);
            firstNode = new Node<E> (null,lastNode);
            size = 0;
        }
        public void print(){
            Node<E> target = firstNode;
            int i = 0;
            while (i <= size) {
                i++;
                System.out.print(target.getCurrentElement()  + " ");
                target = target.getNextElement();
            }
            System.out.println();
        }
        private class Node<E> {
            private E currentElement;
            private Node<E> nextElement;
            private Node(E currentElement, Node<E> nextElement){
                this.currentElement = currentElement;
                this.nextElement = nextElement;
            }
            public E getCurrentElement(){
                return this.currentElement;
            }
            public void setCurrentElement(E currentElement){
                this.currentElement = currentElement;
            }
            public Node<E> getNextElement(){
                return this.nextElement;
            }
            public void setNextElement(Node<E> nextElement){
                this.nextElement = nextElement;
            }
        }
    }
}
