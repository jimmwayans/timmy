package java.nio.channels;

import java.nio.ByteBuffer;
import java.util.concurrent.Future;

public interface AsynchronousByteChannel extends AsynchronousChannel {
  <A> void read(ByteBuffer paramByteBuffer, A paramA, CompletionHandler<Integer, ? super A> paramCompletionHandler);
  
  Future<Integer> read(ByteBuffer paramByteBuffer);
  
  <A> void write(ByteBuffer paramByteBuffer, A paramA, CompletionHandler<Integer, ? super A> paramCompletionHandler);
  
  Future<Integer> write(ByteBuffer paramByteBuffer);
}


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/java/nio/channels/AsynchronousByteChannel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */