public class trieTest{
	public static void main(String[] args){
		Trie trie = new Trie();
		Node root = new Node('/');
		String s = "satvik";
		String[] data = {"satvik", "kartik", "sarthak", "keshav"};
		for(String i:data){
			trie.insert(root, i);
		}
		
		String[] check = {"s", "ka", "ke", "sar", "kesh", "satvi"};
		for(String i:check){
			System.out.println(trie.isPresent(root, i));
		}
	}
}

class Node{
	char val;
	Node[] links;
	Node(char i){
		this.val = i;
		links = new Node[26];
	}
}

class Trie{
	public void insert(Node root, String s){
		Node temp = root;
		for(char i:s.toCharArray()){
			if(temp.links[i-'a'] == null){
				temp.links[i-'a'] = new Node(i);
			}
			temp = temp.links[i-'a'];
		}
	}
	public boolean isPresent(Node root, String s){
		Node temp = root;
		for(char i:s.toCharArray()){
			if(temp.links[i-'a']==null){
				return false;
			}
			temp = temp.links[i-'a'];
		}
		return true;
	}
}