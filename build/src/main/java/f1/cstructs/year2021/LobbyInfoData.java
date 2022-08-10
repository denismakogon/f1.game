// Generated by jextract

package f1.cstructs.year2021;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class LobbyInfoData {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("m_aiControlled"),
        Constants$root.C_CHAR$LAYOUT.withName("m_teamId"),
        Constants$root.C_CHAR$LAYOUT.withName("m_nationality"),
        MemoryLayout.sequenceLayout(48, Constants$root.C_CHAR$LAYOUT).withName("m_name"),
        Constants$root.C_CHAR$LAYOUT.withName("m_carNumber"),
        Constants$root.C_CHAR$LAYOUT.withName("m_readyStatus")
    ).withName("LobbyInfoData");
    public static MemoryLayout $LAYOUT() {
        return LobbyInfoData.$struct$LAYOUT;
    }
    static final VarHandle m_aiControlled$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_aiControlled"));
    public static VarHandle m_aiControlled$VH() {
        return LobbyInfoData.m_aiControlled$VH;
    }
    public static byte m_aiControlled$get(MemorySegment seg) {
        return (byte)LobbyInfoData.m_aiControlled$VH.get(seg);
    }
    public static void m_aiControlled$set( MemorySegment seg, byte x) {
        LobbyInfoData.m_aiControlled$VH.set(seg, x);
    }
    public static byte m_aiControlled$get(MemorySegment seg, long index) {
        return (byte)LobbyInfoData.m_aiControlled$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_aiControlled$set(MemorySegment seg, long index, byte x) {
        LobbyInfoData.m_aiControlled$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_teamId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_teamId"));
    public static VarHandle m_teamId$VH() {
        return LobbyInfoData.m_teamId$VH;
    }
    public static byte m_teamId$get(MemorySegment seg) {
        return (byte)LobbyInfoData.m_teamId$VH.get(seg);
    }
    public static void m_teamId$set( MemorySegment seg, byte x) {
        LobbyInfoData.m_teamId$VH.set(seg, x);
    }
    public static byte m_teamId$get(MemorySegment seg, long index) {
        return (byte)LobbyInfoData.m_teamId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_teamId$set(MemorySegment seg, long index, byte x) {
        LobbyInfoData.m_teamId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_nationality$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_nationality"));
    public static VarHandle m_nationality$VH() {
        return LobbyInfoData.m_nationality$VH;
    }
    public static byte m_nationality$get(MemorySegment seg) {
        return (byte)LobbyInfoData.m_nationality$VH.get(seg);
    }
    public static void m_nationality$set( MemorySegment seg, byte x) {
        LobbyInfoData.m_nationality$VH.set(seg, x);
    }
    public static byte m_nationality$get(MemorySegment seg, long index) {
        return (byte)LobbyInfoData.m_nationality$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_nationality$set(MemorySegment seg, long index, byte x) {
        LobbyInfoData.m_nationality$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment m_name$slice(MemorySegment seg) {
        return seg.asSlice(3, 48);
    }
    static final VarHandle m_carNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_carNumber"));
    public static VarHandle m_carNumber$VH() {
        return LobbyInfoData.m_carNumber$VH;
    }
    public static byte m_carNumber$get(MemorySegment seg) {
        return (byte)LobbyInfoData.m_carNumber$VH.get(seg);
    }
    public static void m_carNumber$set( MemorySegment seg, byte x) {
        LobbyInfoData.m_carNumber$VH.set(seg, x);
    }
    public static byte m_carNumber$get(MemorySegment seg, long index) {
        return (byte)LobbyInfoData.m_carNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_carNumber$set(MemorySegment seg, long index, byte x) {
        LobbyInfoData.m_carNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_readyStatus$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_readyStatus"));
    public static VarHandle m_readyStatus$VH() {
        return LobbyInfoData.m_readyStatus$VH;
    }
    public static byte m_readyStatus$get(MemorySegment seg) {
        return (byte)LobbyInfoData.m_readyStatus$VH.get(seg);
    }
    public static void m_readyStatus$set( MemorySegment seg, byte x) {
        LobbyInfoData.m_readyStatus$VH.set(seg, x);
    }
    public static byte m_readyStatus$get(MemorySegment seg, long index) {
        return (byte)LobbyInfoData.m_readyStatus$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_readyStatus$set(MemorySegment seg, long index, byte x) {
        LobbyInfoData.m_readyStatus$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

