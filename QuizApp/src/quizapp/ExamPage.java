/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quizapp;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author sathe
 */
public class ExamPage extends javax.swing.JFrame {

    public String questionId="1";
    public String answer;
    public int min=0;
    public int sec=1;
    public int marks=0;
    public int NextQueTime=59;
    public String studentId;
    public String language;
    
    public void answerCheck(){
        String studentAnswer = "";
        int CheckAnsBox = 0;
        
        if(jRadioButton1.isSelected()){
            studentAnswer = jRadioButton1.getText();
            CheckAnsBox=1;
        }else if(jRadioButton2.isSelected()){
            studentAnswer = jRadioButton2.getText();
            CheckAnsBox=1;
        }else if(jRadioButton3.isSelected()){
            studentAnswer = jRadioButton3.getText();
            CheckAnsBox=1;
        }else if(jRadioButton4.isSelected()){
            studentAnswer = jRadioButton4.getText();
            CheckAnsBox=1;
        }
        
        if(studentAnswer.equals(answer)){
            marks++;
        }
        
//        set color to QuestionBox

         if(CheckAnsBox == 1){
             if("1".equals(questionId)){
                 QuestionBox1.setBackground(new java.awt.Color(51, 255, 51));
                 CheckAnsBox=0;
             }else if("2".equals(questionId)){
                 QuestionBox2.setBackground(new java.awt.Color(51, 255, 51));
                 CheckAnsBox=0;
             }else if("3".equals(questionId)){
                 QuestionBox3.setBackground(new java.awt.Color(51, 255, 51));
                 CheckAnsBox=0;
             }else if("4".equals(questionId)){
                 QuestionBox4.setBackground(new java.awt.Color(51, 255, 51));
                 CheckAnsBox=0;
             }else if("5".equals(questionId)){
                 QuestionBox5.setBackground(new java.awt.Color(51, 255, 51));
                 CheckAnsBox=0;
             }else if("6".equals(questionId)){
                 QuestionBox6.setBackground(new java.awt.Color(51, 255, 51));
                 CheckAnsBox=0;
             }else if("7".equals(questionId)){
                 QuestionBox7.setBackground(new java.awt.Color(51, 255, 51));
                 CheckAnsBox=0;
             }else if("8".equals(questionId)){
                 QuestionBox8.setBackground(new java.awt.Color(51, 255, 51));
                 CheckAnsBox=0;
             }else if("9".equals(questionId)){
                 QuestionBox9.setBackground(new java.awt.Color(51, 255, 51));
                 CheckAnsBox=0;
             }else if("10".equals(questionId)){
                 QuestionBox10.setBackground(new java.awt.Color(51, 255, 51));
                 CheckAnsBox=0;
             }else if("11".equals(questionId)){
                 QuestionBox11.setBackground(new java.awt.Color(51, 255, 51));
                 CheckAnsBox=0;
             }else if("12".equals(questionId)){
                 QuestionBox12.setBackground(new java.awt.Color(51, 255, 51));
                 CheckAnsBox=0;
             }else if("13".equals(questionId)){
                 QuestionBox13.setBackground(new java.awt.Color(51, 255, 51));
                 CheckAnsBox=0;
             }else if("14".equals(questionId)){
                 QuestionBox14.setBackground(new java.awt.Color(51, 255, 51));
                 CheckAnsBox=0;
             }else if("15".equals(questionId)){
                 QuestionBox15.setBackground(new java.awt.Color(51, 255, 51));
                 CheckAnsBox=0;
             }else if("16".equals(questionId)){
                 QuestionBox16.setBackground(new java.awt.Color(51, 255, 51));
                 CheckAnsBox=0;
             }else if("17".equals(questionId)){
                 QuestionBox17.setBackground(new java.awt.Color(51, 255, 51));
                 CheckAnsBox=0;
             }else if("18".equals(questionId)){
                 QuestionBox18.setBackground(new java.awt.Color(51, 255, 51));
                 CheckAnsBox=0;
             }else if("19".equals(questionId)){
                 QuestionBox19.setBackground(new java.awt.Color(51, 255, 51));
                 CheckAnsBox=0;
             }else if("20".equals(questionId)){
                 QuestionBox20.setBackground(new java.awt.Color(51, 255, 51));
                 CheckAnsBox=0;
             }
         }
            
        
//        question number change
        int newQuestion = Integer.parseInt(this.questionId);
        newQuestion++;
        this.questionId = String.valueOf(newQuestion);
        
//        clear radiobutton
        buttonGroup1.clearSelection();
       
        
//        last question ide next button
        if(this.questionId.equals("20")){
            jButton1.setVisible(false);
        }
    }
    public void question(){
        NextQueTime=60;
         try {
            Connection con = Conn.getCon();
            Statement st = con.createStatement();
          
            ResultSet rs2 = st.executeQuery("select * from "+language+" where id = '"+questionId+"'");
            
            while(rs2.next()){
                jLabel17.setText(rs2.getString(1));
                jLabel18.setText(rs2.getString(2));
                jRadioButton1.setText(rs2.getString(3));
                jRadioButton2.setText(rs2.getString(4));
                jRadioButton3.setText(rs2.getString(5));
                jRadioButton4.setText(rs2.getString(6));
                answer = rs2.getString(7);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    public void submit(){
//       String  studentId = jLabel10.getText();
       answerCheck();
        try {
            Connection con = Conn.getCon();
            Statement st = con.createStatement();
            String email="";
            
            String sql = "select * from studentInfo where id = '"+studentId+"'";
            ResultSet  rs = st.executeQuery(sql);
            if(rs.next()){
            email = rs.getString("email");
            }
           
            String sql2 = "select * from studentMarks where email = '"+email+"'";
            ResultSet  rs2 = st.executeQuery(sql2);
            
            String Attempt="";
            String mark2="";
            if(rs2.next()){
            Attempt = rs2.getString(language+"Attempt");
            mark2 = rs2.getString(language+"Mark");
            }
            
            if(Attempt == null){
                Attempt ="0";
            }
            if(mark2 == null){
                mark2 = "0";
            }
            
            int Attempt2 = Integer.parseInt(Attempt);
            Attempt2++;
            Attempt = String.valueOf(Attempt2);
          
            int mark3 = Integer.parseInt(mark2);
            
            if(mark3 < marks){
                mark3 = marks;
            }
            
            mark2 = String.valueOf(mark3);
            
            st.executeUpdate("update studentMarks set "+language+"Mark= '"+mark2+"', "+language+"Attempt= '"+Attempt+"'  where email = '"+email+"'");
            String mark = String.valueOf(marks);
            dispose();
            new SuccessfullySubmited( studentId,language,mark).setVisible(true);
                
//               JOptionPane.showMessageDialog(null, marks);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    /**
     * Creates new form ExamPage
     */
    public ExamPage() {
        initComponents();
    }
    
    Timer time;
    public ExamPage(String studentId, String language) {
        initComponents();
        
        this.studentId = studentId;
        this.language = language;
        
        jLabel10.setText(this.studentId);
        
//        date
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        jLabel4.setText(dFormat.format(date));
        
//        first question and student details
        try {
            Connection con = Conn.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from studentInfo where id = '"+this.studentId+"'");
            while(rs.next()){
                jLabel2.setText("Welcome "+rs.getString(2));
            }
            ResultSet rs2 = st.executeQuery("select * from "+this.language+" where id = '"+questionId+"'");
            
            while(rs2.next()){
                jLabel17.setText(rs2.getString(1));
                jLabel18.setText(rs2.getString(2));
                jRadioButton1.setText(rs2.getString(3));
                jRadioButton2.setText(rs2.getString(4));
                jRadioButton3.setText(rs2.getString(5));
                jRadioButton4.setText(rs2.getString(6));
                answer = rs2.getString(7);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
//        time program
        setLocationRelativeTo(this);
        time = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(sec<10){
                    jLabel911.setText("0"+String.valueOf(sec));
                }else{
                    jLabel911.setText(String.valueOf(sec));
                }
                if(min<10){
                    jLabel8.setText("0"+String.valueOf(min));
                }else{
                    jLabel8.setText(String.valueOf(min));
                }
                 sec++;
                if(sec == 60){
                    sec=0;
                    min++;
                    
                    if(min==20){
                        time.stop();
                        answerCheck();
                        submit();
                    }
                }
                
                if(NextQueTime<10){
                     nextQueSec.setText("0"+String.valueOf(NextQueTime));
                }else{
                     nextQueSec.setText(String.valueOf(NextQueTime));
                }
               
               if(NextQueTime == 0){
                   answerCheck();
                   question();
               }
               NextQueTime--;
               
               if("21".equals(questionId)){
                        time.stop();
                        answerCheck();
                        submit();
                    }
            }
        });
        time.start();
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel911 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nextQueSec = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        QuestionBox1 = new javax.swing.JPanel();
        QuestionBox4 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        QuestionBox3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        QuestionBox5 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        QuestionBox6 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        QuestionBox7 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        QuestionBox8 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        QuestionBox9 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        QuestionBox10 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        QuestionBox2 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        QuestionBox11 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        QuestionBox12 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        QuestionBox13 = new javax.swing.JPanel();
        QuestionBox14 = new javax.swing.JPanel();
        QuestionBox15 = new javax.swing.JPanel();
        QuestionBox16 = new javax.swing.JPanel();
        QuestionBox17 = new javax.swing.JPanel();
        QuestionBox18 = new javax.swing.JPanel();
        QuestionBox19 = new javax.swing.JPanel();
        QuestionBox20 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 200));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/student.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 169, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 30)); // NOI18N
        jLabel2.setText("Welcome Omkar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 490, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel3.setText("Date:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel4.setText("25/11/2022");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel5.setText("Total Time:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel6.setText("20 min");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel7.setText("Next Question:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel8.setText("00");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 80, 30, -1));

        jLabel911.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel911.setText("00");
        jPanel1.add(jLabel911, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 80, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel10.setText("15");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 150, -1));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel11.setText("Student Id:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel14.setText("Total Question:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel15.setText("20");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 80, 40, -1));

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel16.setText("Question Number:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel17.setText("12");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 140, 40, -1));

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel13.setText(":");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1275, 78, 10, -1));

        jLabel20.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel20.setText("Time Taken:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 80, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel9.setText("Sec");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 140, -1, -1));

        nextQueSec.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        nextQueSec.setText("00");
        jPanel1.add(nextQueSec, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 140, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 205, 1370, 10));

        jLabel18.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel18.setText("Question");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 930, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jRadioButton1.setText("jRadioButton1");
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jRadioButton2.setText("jRadioButton2");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, -1, -1));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jRadioButton3.setText("jRadioButton3");
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, -1, -1));

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jRadioButton4.setText("jRadioButton4");
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 600, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Next.png"))); // NOI18N
        jButton1.setText("next");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 680, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jButton2.setText("Submit");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 670, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Teal Love.jpg"))); // NOI18N
        jLabel12.setPreferredSize(new java.awt.Dimension(1066, 505));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 505));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel22.setText("01");
        jLabel22.setPreferredSize(new java.awt.Dimension(30, 25));
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 23, 35, -1));

        QuestionBox1.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel2.add(QuestionBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 23, -1, -1));

        QuestionBox4.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel2.add(QuestionBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 167, -1, -1));

        jLabel24.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel24.setText("04");
        jLabel24.setPreferredSize(new java.awt.Dimension(35, 25));
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 167, -1, -1));

        QuestionBox3.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel2.add(QuestionBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 119, -1, -1));

        jLabel25.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel25.setText("03");
        jLabel25.setPreferredSize(new java.awt.Dimension(35, 25));
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 119, -1, -1));

        QuestionBox5.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel2.add(QuestionBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 215, -1, -1));

        jLabel26.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel26.setText("05");
        jLabel26.setPreferredSize(new java.awt.Dimension(35, 25));
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 215, -1, -1));

        QuestionBox6.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel2.add(QuestionBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 263, -1, -1));

        jLabel27.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel27.setText("06");
        jLabel27.setPreferredSize(new java.awt.Dimension(35, 25));
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 263, -1, -1));

        QuestionBox7.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel2.add(QuestionBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 311, -1, -1));

        jLabel28.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel28.setText("07");
        jLabel28.setPreferredSize(new java.awt.Dimension(35, 25));
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 311, -1, -1));

        QuestionBox8.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel2.add(QuestionBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 359, -1, -1));

        jLabel29.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel29.setText("08");
        jLabel29.setPreferredSize(new java.awt.Dimension(35, 25));
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 359, -1, -1));

        jLabel30.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel30.setText("02");
        jLabel30.setPreferredSize(new java.awt.Dimension(35, 25));
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 71, -1, -1));

        QuestionBox9.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel2.add(QuestionBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 407, -1, -1));

        jLabel31.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel31.setText("09");
        jLabel31.setPreferredSize(new java.awt.Dimension(35, 25));
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 407, -1, -1));

        QuestionBox10.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel2.add(QuestionBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 455, -1, -1));

        jLabel32.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel32.setText("10");
        jLabel32.setPreferredSize(new java.awt.Dimension(35, 25));
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 455, -1, -1));

        QuestionBox2.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel2.add(QuestionBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 71, -1, -1));

        jLabel23.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel23.setText("11");
        jLabel23.setPreferredSize(new java.awt.Dimension(35, 25));
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 23, -1, -1));

        QuestionBox11.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel2.add(QuestionBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 23, -1, -1));

        jLabel33.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel33.setText("12");
        jLabel33.setPreferredSize(new java.awt.Dimension(35, 25));
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 71, -1, -1));

        QuestionBox12.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel2.add(QuestionBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 71, -1, -1));

        jLabel34.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel34.setText("13");
        jLabel34.setPreferredSize(new java.awt.Dimension(35, 25));
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 119, -1, -1));

        jLabel35.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel35.setText("14");
        jLabel35.setPreferredSize(new java.awt.Dimension(35, 25));
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 167, -1, -1));

        jLabel36.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel36.setText("15");
        jLabel36.setPreferredSize(new java.awt.Dimension(35, 25));
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 215, -1, -1));

        jLabel37.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel37.setText("16");
        jLabel37.setPreferredSize(new java.awt.Dimension(35, 25));
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 263, -1, -1));

        jLabel38.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel38.setText("17");
        jLabel38.setPreferredSize(new java.awt.Dimension(35, 25));
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 311, -1, -1));

        jLabel39.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel39.setText("18");
        jLabel39.setPreferredSize(new java.awt.Dimension(35, 25));
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 359, -1, -1));

        jLabel40.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel40.setText("19");
        jLabel40.setPreferredSize(new java.awt.Dimension(35, 25));
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 407, -1, -1));

        jLabel41.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel41.setText("20");
        jLabel41.setPreferredSize(new java.awt.Dimension(35, 25));
        jPanel2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 455, -1, -1));

        QuestionBox13.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel2.add(QuestionBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 119, -1, -1));

        QuestionBox14.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel2.add(QuestionBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 167, -1, -1));

        QuestionBox15.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel2.add(QuestionBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 215, -1, -1));

        QuestionBox16.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel2.add(QuestionBox16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 263, -1, -1));

        QuestionBox17.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel2.add(QuestionBox17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 311, -1, -1));

        QuestionBox18.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel2.add(QuestionBox18, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 359, -1, -1));

        QuestionBox19.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel2.add(QuestionBox19, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 407, -1, -1));

        QuestionBox20.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel2.add(QuestionBox20, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 455, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 220, 505));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ServQuick.jpg"))); // NOI18N
        jLabel19.setText("jLabel19");
        jLabel19.setPreferredSize(new java.awt.Dimension(1366, 570));
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        answerCheck();
        question();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to submit?", "Select", JOptionPane.YES_NO_OPTION);
        if(a == 0){         
            submit();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ExamPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel QuestionBox1;
    private javax.swing.JPanel QuestionBox10;
    private javax.swing.JPanel QuestionBox11;
    private javax.swing.JPanel QuestionBox12;
    private javax.swing.JPanel QuestionBox13;
    private javax.swing.JPanel QuestionBox14;
    private javax.swing.JPanel QuestionBox15;
    private javax.swing.JPanel QuestionBox16;
    private javax.swing.JPanel QuestionBox17;
    private javax.swing.JPanel QuestionBox18;
    private javax.swing.JPanel QuestionBox19;
    private javax.swing.JPanel QuestionBox2;
    private javax.swing.JPanel QuestionBox20;
    private javax.swing.JPanel QuestionBox3;
    private javax.swing.JPanel QuestionBox4;
    private javax.swing.JPanel QuestionBox5;
    private javax.swing.JPanel QuestionBox6;
    private javax.swing.JPanel QuestionBox7;
    private javax.swing.JPanel QuestionBox8;
    private javax.swing.JPanel QuestionBox9;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel911;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nextQueSec;
    // End of variables declaration//GEN-END:variables
}
