package GAME;

public class Logic {
	private int[][]Umap; //���õ�ͼ
	public PubData data = new PubData();
	private int rows = data.rows;
	private int cols = data.cols;
	public Logic() {
		
		Umap = new int[rows][cols]; 
	}
	
	public void gameCycle(Map m) {
		int i,j;
			for(i=0;i<rows;i++) {
				for(j=0;j<cols;j++) {
					if(m.countAround(i,j)>=4)
						Umap[i][j]=0;
					else if(m.countAround(i,j)==3)
						Umap[i][j]=1;
					else if(m.countAround(i,j)==2)
						Umap[i][j]=m.get(i, j);
					else if(m.countAround(i,j)<=1)
						Umap[i][j]=0;
				}
			}
			for(i=0;i<rows;i++) {
				for(j=0;j<cols;j++) {
					updateMap(i,j,Umap[i][j],m);
				}
			}
	}
	
	public void updateMap(int row,int col,int val,Map m) {
		m.set(row,col,val);
	}

}
