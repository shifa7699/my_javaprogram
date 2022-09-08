package programs;


class Test_2 
{
    StudentDetails s=new StudentDetails();
    StudentBusinessLogic stb=new StudentBusinessLogic();
    @Test
    void test()
    {
        s.setName("Neha");
        s.setMarks1(60);
        s.setMarks2(77);
        s.setMarks3(71);
        double percent=stb.cal_percentage(s);
        assertEquals(69.3333333,percent);
    }
}
