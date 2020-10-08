class node{
    int data;
    node left;
    node right;
}

class tree {
    node root = new node();
    tree(int a) {
        root.data = a;
    }

    void add(int a) {
        boolean flag = true;
        node s = new node();
        s.data = a;
        node temp=this.root;
        while(flag){
            if(temp.data>a){
                if(temp.left!=null){
                    temp=temp.left;
                }
                else{
                    temp.left=s;
                    flag=false;
                }
            }
            if(temp.data<=a){
                if(temp.right!=null){
                    temp=temp.right;
                }
                else{
                    temp.right=s;
                    flag=false;
                }
            }
        }
    }
    void print(){
        if(root==null){
            return;
        }
        node temp=root;        
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.left;
        }
        temp=root;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.right;
        }
    }
}
class bs{
    public static void main(String args[]){
        tree bst=new tree(0);
        bst.add(-2);
        bst.add(2);
        bst.add(-1);
        bst.add(1);
        bst.add(3);
        bst.add(-4);
        bst.add(-3);
        bst.add(5);
        
    }
}