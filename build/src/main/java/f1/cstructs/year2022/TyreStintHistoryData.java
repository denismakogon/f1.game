// Generated by jextract

package f1.cstructs.year2022;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class TyreStintHistoryData {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("m_endLap"),
        Constants$root.C_CHAR$LAYOUT.withName("m_tyreActualCompound"),
        Constants$root.C_CHAR$LAYOUT.withName("m_tyreVisualCompound")
    ).withName("TyreStintHistoryData");
    public static MemoryLayout $LAYOUT() {
        return TyreStintHistoryData.$struct$LAYOUT;
    }
    static final VarHandle m_endLap$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_endLap"));
    public static VarHandle m_endLap$VH() {
        return TyreStintHistoryData.m_endLap$VH;
    }
    public static byte m_endLap$get(MemorySegment seg) {
        return (byte)TyreStintHistoryData.m_endLap$VH.get(seg);
    }
    public static void m_endLap$set( MemorySegment seg, byte x) {
        TyreStintHistoryData.m_endLap$VH.set(seg, x);
    }
    public static byte m_endLap$get(MemorySegment seg, long index) {
        return (byte)TyreStintHistoryData.m_endLap$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_endLap$set(MemorySegment seg, long index, byte x) {
        TyreStintHistoryData.m_endLap$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_tyreActualCompound$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_tyreActualCompound"));
    public static VarHandle m_tyreActualCompound$VH() {
        return TyreStintHistoryData.m_tyreActualCompound$VH;
    }
    public static byte m_tyreActualCompound$get(MemorySegment seg) {
        return (byte)TyreStintHistoryData.m_tyreActualCompound$VH.get(seg);
    }
    public static void m_tyreActualCompound$set( MemorySegment seg, byte x) {
        TyreStintHistoryData.m_tyreActualCompound$VH.set(seg, x);
    }
    public static byte m_tyreActualCompound$get(MemorySegment seg, long index) {
        return (byte)TyreStintHistoryData.m_tyreActualCompound$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_tyreActualCompound$set(MemorySegment seg, long index, byte x) {
        TyreStintHistoryData.m_tyreActualCompound$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_tyreVisualCompound$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_tyreVisualCompound"));
    public static VarHandle m_tyreVisualCompound$VH() {
        return TyreStintHistoryData.m_tyreVisualCompound$VH;
    }
    public static byte m_tyreVisualCompound$get(MemorySegment seg) {
        return (byte)TyreStintHistoryData.m_tyreVisualCompound$VH.get(seg);
    }
    public static void m_tyreVisualCompound$set( MemorySegment seg, byte x) {
        TyreStintHistoryData.m_tyreVisualCompound$VH.set(seg, x);
    }
    public static byte m_tyreVisualCompound$get(MemorySegment seg, long index) {
        return (byte)TyreStintHistoryData.m_tyreVisualCompound$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_tyreVisualCompound$set(MemorySegment seg, long index, byte x) {
        TyreStintHistoryData.m_tyreVisualCompound$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

