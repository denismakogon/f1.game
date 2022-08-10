// Generated by jextract

package f1.cstructs.year2021;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class LapHistoryData {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("m_lapTimeInMS"),
        Constants$root.C_SHORT$LAYOUT.withName("m_sector1TimeInMS"),
        Constants$root.C_SHORT$LAYOUT.withName("m_sector2TimeInMS"),
        Constants$root.C_SHORT$LAYOUT.withName("m_sector3TimeInMS"),
        Constants$root.C_CHAR$LAYOUT.withName("m_lapValidBitFlags")
    ).withName("LapHistoryData");
    public static MemoryLayout $LAYOUT() {
        return LapHistoryData.$struct$LAYOUT;
    }
    static final VarHandle m_lapTimeInMS$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_lapTimeInMS"));
    public static VarHandle m_lapTimeInMS$VH() {
        return LapHistoryData.m_lapTimeInMS$VH;
    }
    public static int m_lapTimeInMS$get(MemorySegment seg) {
        return (int)LapHistoryData.m_lapTimeInMS$VH.get(seg);
    }
    public static void m_lapTimeInMS$set( MemorySegment seg, int x) {
        LapHistoryData.m_lapTimeInMS$VH.set(seg, x);
    }
    public static int m_lapTimeInMS$get(MemorySegment seg, long index) {
        return (int)LapHistoryData.m_lapTimeInMS$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_lapTimeInMS$set(MemorySegment seg, long index, int x) {
        LapHistoryData.m_lapTimeInMS$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_sector1TimeInMS$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_sector1TimeInMS"));
    public static VarHandle m_sector1TimeInMS$VH() {
        return LapHistoryData.m_sector1TimeInMS$VH;
    }
    public static short m_sector1TimeInMS$get(MemorySegment seg) {
        return (short)LapHistoryData.m_sector1TimeInMS$VH.get(seg);
    }
    public static void m_sector1TimeInMS$set( MemorySegment seg, short x) {
        LapHistoryData.m_sector1TimeInMS$VH.set(seg, x);
    }
    public static short m_sector1TimeInMS$get(MemorySegment seg, long index) {
        return (short)LapHistoryData.m_sector1TimeInMS$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_sector1TimeInMS$set(MemorySegment seg, long index, short x) {
        LapHistoryData.m_sector1TimeInMS$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_sector2TimeInMS$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_sector2TimeInMS"));
    public static VarHandle m_sector2TimeInMS$VH() {
        return LapHistoryData.m_sector2TimeInMS$VH;
    }
    public static short m_sector2TimeInMS$get(MemorySegment seg) {
        return (short)LapHistoryData.m_sector2TimeInMS$VH.get(seg);
    }
    public static void m_sector2TimeInMS$set( MemorySegment seg, short x) {
        LapHistoryData.m_sector2TimeInMS$VH.set(seg, x);
    }
    public static short m_sector2TimeInMS$get(MemorySegment seg, long index) {
        return (short)LapHistoryData.m_sector2TimeInMS$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_sector2TimeInMS$set(MemorySegment seg, long index, short x) {
        LapHistoryData.m_sector2TimeInMS$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_sector3TimeInMS$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_sector3TimeInMS"));
    public static VarHandle m_sector3TimeInMS$VH() {
        return LapHistoryData.m_sector3TimeInMS$VH;
    }
    public static short m_sector3TimeInMS$get(MemorySegment seg) {
        return (short)LapHistoryData.m_sector3TimeInMS$VH.get(seg);
    }
    public static void m_sector3TimeInMS$set( MemorySegment seg, short x) {
        LapHistoryData.m_sector3TimeInMS$VH.set(seg, x);
    }
    public static short m_sector3TimeInMS$get(MemorySegment seg, long index) {
        return (short)LapHistoryData.m_sector3TimeInMS$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_sector3TimeInMS$set(MemorySegment seg, long index, short x) {
        LapHistoryData.m_sector3TimeInMS$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_lapValidBitFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_lapValidBitFlags"));
    public static VarHandle m_lapValidBitFlags$VH() {
        return LapHistoryData.m_lapValidBitFlags$VH;
    }
    public static byte m_lapValidBitFlags$get(MemorySegment seg) {
        return (byte)LapHistoryData.m_lapValidBitFlags$VH.get(seg);
    }
    public static void m_lapValidBitFlags$set( MemorySegment seg, byte x) {
        LapHistoryData.m_lapValidBitFlags$VH.set(seg, x);
    }
    public static byte m_lapValidBitFlags$get(MemorySegment seg, long index) {
        return (byte)LapHistoryData.m_lapValidBitFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_lapValidBitFlags$set(MemorySegment seg, long index, byte x) {
        LapHistoryData.m_lapValidBitFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

