public class GithubTest{
    public static void main(String[] args){
        System.out.println("テスト");
        System.out.println("push");
        System.out.println("javaのみ変更");
        System.out.prntln("ワークスペース閉じた後に変更");
    }
}

public void createBranch(){
    System.out.println("ブランチを作成後、コードを追記しました。");
}

public int missMethod(){
    System.out.println("間違えた実装をしてしまった");
    return -1;
}