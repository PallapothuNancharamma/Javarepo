import java.util.*;
public class Ladder 
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int M = sc.nextInt();
int N = sc.nextInt();
char[][] grid = new char[M][N];
for(int i = 0; i < M; i++)
{
String line = sc.nextLine().trim();
for(int j = 0; j < N; j++)
{
grid[i][j] = line.charAt(j);
}
} 
for (int i = 0; i < M; i++) {
for (int j = 0; j < N; j++) {
System.out.print(grid[i][j] + " ");
}
System.out.println();
}
List<int[]> start = new ArrayList<>();
List<int[]> goal = new ArrayList<>();
for (int i = 0; i < M; i++) {
for (int j = 0; j < N; j++) 
{
if (grid[i][j] == 'T') 
{
start.add(new int[]{i, j});
}
if (grid[i][j] == 'L') 
{
goal.add(new int[]{i, j});
}
}
}
System.out.println("Start positions of ladder (T):");
for (int[] s : start) System.out.println(Arrays.toString(s));
System.out.println();
System.out.println("Goal positions of ladder (L):");
for (int[] g : goal) 
System.out.println(Arrays.toString(g));
int steps = 0;
System.out.println("\nMoving ladder down step by step:");
while (!samePosition(start, goal)) {
for (int[] s : start) {
s[0]++; 
}
steps++;
printGrid(M, N, start, goal);
if (steps > 5) break; 
}
if (samePosition(start, goal))
{
System.out.println("\nReached goal in " + steps + " steps!");
}
else
{
System.out.println("\nCannot reach goal easily!");
}
}
static boolean samePosition(List<int[]> t, List<int[]> l) {
if (t.size() != l.size()) 
{
return false;
}    
for (int i = 0; i < t.size(); i++) 
{
if (t.get(i)[0] != l.get(i)[0] || t.get(i)[1] != l.get(i)[1])
{
return false;
}        
}
return true;
}
static void printGrid(int m, int n, List<int[]> t, List<int[]> l) {
char[][] temp = new char[m][n];
for (char[] row : temp) Arrays.fill(row, 'E');
for (int[] g : l) temp[g[0]][g[1]] = 'L';
for (int[] s : t) temp[s[0]][s[1]] = 'T';
System.out.println();
for (int i = 0; i < M; i++) {
for (int j = 0; j < N; j++) {
System.out.print(temp[i][j] + " ");
}           
System.out.println();
}
}
}
       
        
