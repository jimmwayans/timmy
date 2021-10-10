package java.awt.image;

import java.awt.Point;

public interface WritableRenderedImage extends RenderedImage {
  void addTileObserver(TileObserver paramTileObserver);
  
  void removeTileObserver(TileObserver paramTileObserver);
  
  WritableRaster getWritableTile(int paramInt1, int paramInt2);
  
  void releaseWritableTile(int paramInt1, int paramInt2);
  
  boolean isTileWritable(int paramInt1, int paramInt2);
  
  Point[] getWritableTileIndices();
  
  boolean hasTileWriters();
  
  void setData(Raster paramRaster);
}


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/java/awt/image/WritableRenderedImage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */