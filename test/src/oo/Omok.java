package oo;

import java.util.Scanner;

public class Omok {
    public static void main(String[] args) {
    	
        Player user = new Player("사용자", "O");
        Player computer = new Player("컴퓨터", "X");
        Board board = new Board(19);
        play(board, user, computer);
    }
    private static void play(Board board, Player user, Player computer) {
    	boolean run = true;
    	boolean turn = true;
    	Scanner sc = new Scanner(System.in);
    	int col = 0;
    	String row = null;
    	board.print();
    	while(run) {
    		System.out.println();
    		if(turn) {
    			System.out.println(user.name+">");
    		}else {
    			System.out.println(computer.name+">");
    		}
    	
    	col = sc.nextInt();
    	row = sc.next();
    	row = row.toUpperCase();
        char rowChar = row.charAt(0);
        int rowint = rowChar;
        rowint= rowint-65;
        if(!adddol(col, rowint, board)) {
        	System.out.println("중복입니다.");
        	System.out.println("다른곳에 놓아주세요");
        	continue;
        }
        
        if(turn) {
        	board.map[col][rowint]=user.stone;
        	turn=false;
        }else {
        	board.map[col][rowint]=computer.stone;
        	turn=true;
        }
        board.print();
        boolean cheak1 = rowcheak1(board);
        boolean cheak2 = colcheak2(board);
        boolean cheak3 = rowcheak(board);
        boolean cheak4 = colcheak(board);
        
        if(cheak1 | cheak2) {
        	run = false;
        }
        if(cheak3 | cheak4) {
        	run = false;
        }
        
        if(run == false) {
        	System.out.println();
        	System.out.println("오목");
        	if(turn==false) {
        	System.out.println(user.name+"승");
        }else {
        	System.out.println(computer.name+"승");
        }
<<<<<<< HEAD

        
    	
        
        
    }
    }     

    }
    private static  boolean rowcheak1(Board board) {
    	int  win = 0 ;
    	for(int i = 0 ; i<board.map.length; i++) {
    		for (int j = 0; j<board.map[i].length; j++){
    			try {
    				for(int k = 0 ; k<6; k++) {
    					if(board.map[i][j+k].equals("O")) {
    						win += 1;
    					    					}
    				}
    			
    			}catch (Exception e) {
    			break;
    			}
    		finally {
				if(win >= 5) {
					return true;
				}else {
					win = 0;
				}
			}
    	}
    	}
    
		return false;
    }
    private static  boolean colcheak2(Board board) {
    	int  win = 0 ;
    	for(int i = 0 ; i<board.map.length; i++) {
    		for (int j = 0; j<board.map[i].length; j++){
    			try {
    				for(int k = 0 ; k<6; k++) {
    					if(board.map[j+k][i].equals("O")) {
    						win += 1;
    					
    					}
    				}
    			
    			}catch (Exception e) {
    			break;
    			}
    		finally {
				if(win >= 5) {
					return true;
				}else {
					win = 0;
				}
			}
    	}
    	}
    	return false;
    
    }
    private static  boolean rowcheak(Board board) {
    	int  win = 0 ;
    	for(int i = 0 ; i<board.map.length; i++) {
    		for (int j = 0; j<board.map[i].length; j++){
    			try {
    				for(int k = 0 ; k<6; k++) {
    					if(board.map[i][j+k].equals("X")) {
    						win += 1;
    					    					}
    				}
    			
    			}catch (Exception e) {
    			break;
    			}
    		finally {
				if(win >= 5) {
					return true;
				}else {
					win = 0;
				}
			}
    	}
    	}
    
		return false;
    }
    private static  boolean colcheak(Board board) {
    	int  win = 0 ;
    	for(int i = 0 ; i<board.map.length; i++) {
    		for (int j = 0; j<board.map[i].length; j++){
    			try {
    				for(int k = 0 ; k<6; k++) {
    					if(board.map[j+k][i].equals("X")) {
    						win += 1;
    					
    					}
    				}
    			
    			}catch (Exception e) {
    			break;
    			}
    		finally {
				if(win >= 5) {
					return true;
				}else {
					win = 0;
				}
			}
    	}
    	}
    	return false;
    
    }
=======
    }
    }     

    }
    private static  boolean rowcheak1(Board board) {
    	int  win = 0 ;
    	for(int i = 0 ; i<board.map.length; i++) {
    		for (int j = 0; j<board.map[i].length; j++){
    			try {
    				for(int k = 0 ; k<6; k++) {
    					if(board.map[i][j+k].equals("O")) {
    						win += 1;
    					    					}
    				}
    			
    			}catch (Exception e) {
    			break;
    			}
    		finally {
				if(win >= 5) {
					return true;
				}else {
					win = 0;
				}
			}
    	}
    	}
    
		return false;
    }
    private static  boolean colcheak2(Board board) {
    	int  win = 0 ;
    	for(int i = 0 ; i<board.map.length; i++) {
    		for (int j = 0; j<board.map[i].length; j++){
    			try {
    				for(int k = 0 ; k<6; k++) {
    					if(board.map[j+k][i].equals("O")) {
    						win += 1;
    					
    					}
    				}
    			
    			}catch (Exception e) {
    			break;
    			}
    		finally {
				if(win >= 5) {
					return true;
				}else {
					win = 0;
				}
			}
    	}
    	}
    	return false;
    
    }
    private static  boolean rowcheak(Board board) {
    	int  win = 0 ;
    	for(int i = 0 ; i<board.map.length; i++) {
    		for (int j = 0; j<board.map[i].length; j++){
    			try {
    				for(int k = 0 ; k<6; k++) {
    					if(board.map[i][j+k].equals("X")) {
    						win += 1;
    					    					}
    				}
    			
    			}catch (Exception e) {
    			break;
    			}
    		finally {
				if(win >= 5) {
					return true;
				}else {
					win = 0;
				}
			}
    	}
    	}
    
		return false;
    }
    private static  boolean colcheak(Board board) {
    	int  win = 0 ;
    	for(int i = 0 ; i<board.map.length; i++) {
    		for (int j = 0; j<board.map[i].length; j++){
    			try {
    				for(int k = 0 ; k<6; k++) {
    					if(board.map[j+k][i].equals("X")) {
    						win += 1;
    					
    					}
    				}
    			
    			}catch (Exception e) {
    			break;
    			}
    		finally {
				if(win >= 5) {
					return true;
				}else {
					win = 0;
				}
			}
    	}
    	}
    	return false;
    
    }
    private void h(Board board) {
    	
		
	}
>>>>>>> refs/remotes/origin/master
    
    private static boolean adddol(int col , int rowint, Board board) {
    	if(board.map[col][rowint] != ".") {
    		return false;
    	}else {
    		return true;
    	}
    	
    }
    
    	
    }
