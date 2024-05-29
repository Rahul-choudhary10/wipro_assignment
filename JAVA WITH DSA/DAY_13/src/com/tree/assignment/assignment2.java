package com.tree.assignment;
import java.util.*;

class TrieNode{
	Map<Character, TrieNode> children;
	boolean isEndOfWord;
	
	public TrieNode() {
		children = new HashMap<>();
		isEndOfWord = false;
	}
}

public class assignment2 {
	private TrieNode root;
	public assignment2() {
		root = new TrieNode();
	}
	
	public void insert(String word) {
		TrieNode current = root;
		for(char c: word.toCharArray()) {
			current.children.putIfAbsent(c, new TrieNode());
			current = current.children.get(c);
		}
		current.isEndOfWord = true;
	}
	
	public boolean isPrefix(String prefix) {
		TrieNode current = root;
		for(char c : prefix.toCharArray()) {
			if(!current.children.containsKey(c)) {
				return false;
			}
			current = current.children.get(c);
		}
		return true;
	}
	
	public static void main(String args[]) {
		assignment2 trie = new assignment2();
		trie.insert("Apple");
		trie.insert("Banana");
		trie.insert("App");
		System.out.println(trie.isPrefix("App"));
		System.out.println(trie.isPrefix("ban"));
	}
}
