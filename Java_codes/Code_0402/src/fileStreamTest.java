import java.io.*;

public class fileStreamTest {
    public static void main(String[] args) throws IOException {
        File f = new File("a.txt");
        FileOutputStream fop = new FileOutputStream(f);
        // 创建 FileOutputStream 对象,文件不存在会自动新建

        OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
        // 创建 OSW 对象

        writer.append("中文输入");
        // 写入到缓冲区

        writer.append("\r\n");
        // 换行

        writer.append("English");
        writer.close();
        // 关闭写入流,同时会把缓冲区内容写入文件
        fop.close();
        // 关闭输出流

        FileInputStream fip = new FileInputStream(f);
        // 构建 FIS 对象

        InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
        // 构建 ISR 对象

        StringBuffer sb = new StringBuffer();
        while(reader.ready()){
            sb.append((char)reader.read());
            // 转成 char 加到 SB 对象中
        }
        
    }
}
