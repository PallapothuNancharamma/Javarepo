import java.io.*;
import java.util.*;
interface Mediaplayer
{
void pause();
void play();
void stop();
}
class Audioplayer implements Mediaplayer
{
public void play()
{
System.out.println("playing Audio file");
}
 public void pause()
{
System.out.println("pausing Audio file");
}
public void stop()
{
System.out.println("stopping Audio file back");
}
}
class Videoplayer implements Mediaplayer
{
public void play()
{
System.out.println("playing video file");
}
public void pause()
{
System.out.println("pausing video file");
}
public void stop()
{
System.out.println("stopping video file back");
}
}
class Bcom
{
public static void main(String[] args)
{
Audioplayer a=new Audioplayer();
Videoplayer v=new Videoplayer ();
a.pause();
a.play();
a.stop();
v.pause();
v.play();
v.stop();
}
}