// Generated by jextract

package f1.cstructs.year2021;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class ParticipantData {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("m_aiControlled"),
        Constants$root.C_CHAR$LAYOUT.withName("m_driverId"),
        Constants$root.C_CHAR$LAYOUT.withName("m_networkId"),
        Constants$root.C_CHAR$LAYOUT.withName("m_teamId"),
        Constants$root.C_CHAR$LAYOUT.withName("m_myTeam"),
        Constants$root.C_CHAR$LAYOUT.withName("m_raceNumber"),
        Constants$root.C_CHAR$LAYOUT.withName("m_nationality"),
        MemoryLayout.sequenceLayout(48, Constants$root.C_CHAR$LAYOUT).withName("m_name"),
        Constants$root.C_CHAR$LAYOUT.withName("m_yourTelemetry")
    ).withName("ParticipantData");
    public static MemoryLayout $LAYOUT() {
        return ParticipantData.$struct$LAYOUT;
    }
    static final VarHandle m_aiControlled$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_aiControlled"));
    public static VarHandle m_aiControlled$VH() {
        return ParticipantData.m_aiControlled$VH;
    }
    public static byte m_aiControlled$get(MemorySegment seg) {
        return (byte)ParticipantData.m_aiControlled$VH.get(seg);
    }
    public static void m_aiControlled$set( MemorySegment seg, byte x) {
        ParticipantData.m_aiControlled$VH.set(seg, x);
    }
    public static byte m_aiControlled$get(MemorySegment seg, long index) {
        return (byte)ParticipantData.m_aiControlled$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_aiControlled$set(MemorySegment seg, long index, byte x) {
        ParticipantData.m_aiControlled$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_driverId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_driverId"));
    public static VarHandle m_driverId$VH() {
        return ParticipantData.m_driverId$VH;
    }
    public static byte m_driverId$get(MemorySegment seg) {
        return (byte)ParticipantData.m_driverId$VH.get(seg);
    }
    public static void m_driverId$set( MemorySegment seg, byte x) {
        ParticipantData.m_driverId$VH.set(seg, x);
    }
    public static byte m_driverId$get(MemorySegment seg, long index) {
        return (byte)ParticipantData.m_driverId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_driverId$set(MemorySegment seg, long index, byte x) {
        ParticipantData.m_driverId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_networkId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_networkId"));
    public static VarHandle m_networkId$VH() {
        return ParticipantData.m_networkId$VH;
    }
    public static byte m_networkId$get(MemorySegment seg) {
        return (byte)ParticipantData.m_networkId$VH.get(seg);
    }
    public static void m_networkId$set( MemorySegment seg, byte x) {
        ParticipantData.m_networkId$VH.set(seg, x);
    }
    public static byte m_networkId$get(MemorySegment seg, long index) {
        return (byte)ParticipantData.m_networkId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_networkId$set(MemorySegment seg, long index, byte x) {
        ParticipantData.m_networkId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_teamId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_teamId"));
    public static VarHandle m_teamId$VH() {
        return ParticipantData.m_teamId$VH;
    }
    public static byte m_teamId$get(MemorySegment seg) {
        return (byte)ParticipantData.m_teamId$VH.get(seg);
    }
    public static void m_teamId$set( MemorySegment seg, byte x) {
        ParticipantData.m_teamId$VH.set(seg, x);
    }
    public static byte m_teamId$get(MemorySegment seg, long index) {
        return (byte)ParticipantData.m_teamId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_teamId$set(MemorySegment seg, long index, byte x) {
        ParticipantData.m_teamId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_myTeam$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_myTeam"));
    public static VarHandle m_myTeam$VH() {
        return ParticipantData.m_myTeam$VH;
    }
    public static byte m_myTeam$get(MemorySegment seg) {
        return (byte)ParticipantData.m_myTeam$VH.get(seg);
    }
    public static void m_myTeam$set( MemorySegment seg, byte x) {
        ParticipantData.m_myTeam$VH.set(seg, x);
    }
    public static byte m_myTeam$get(MemorySegment seg, long index) {
        return (byte)ParticipantData.m_myTeam$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_myTeam$set(MemorySegment seg, long index, byte x) {
        ParticipantData.m_myTeam$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_raceNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_raceNumber"));
    public static VarHandle m_raceNumber$VH() {
        return ParticipantData.m_raceNumber$VH;
    }
    public static byte m_raceNumber$get(MemorySegment seg) {
        return (byte)ParticipantData.m_raceNumber$VH.get(seg);
    }
    public static void m_raceNumber$set( MemorySegment seg, byte x) {
        ParticipantData.m_raceNumber$VH.set(seg, x);
    }
    public static byte m_raceNumber$get(MemorySegment seg, long index) {
        return (byte)ParticipantData.m_raceNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_raceNumber$set(MemorySegment seg, long index, byte x) {
        ParticipantData.m_raceNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_nationality$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_nationality"));
    public static VarHandle m_nationality$VH() {
        return ParticipantData.m_nationality$VH;
    }
    public static byte m_nationality$get(MemorySegment seg) {
        return (byte)ParticipantData.m_nationality$VH.get(seg);
    }
    public static void m_nationality$set( MemorySegment seg, byte x) {
        ParticipantData.m_nationality$VH.set(seg, x);
    }
    public static byte m_nationality$get(MemorySegment seg, long index) {
        return (byte)ParticipantData.m_nationality$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_nationality$set(MemorySegment seg, long index, byte x) {
        ParticipantData.m_nationality$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment m_name$slice(MemorySegment seg) {
        return seg.asSlice(7, 48);
    }
    static final VarHandle m_yourTelemetry$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_yourTelemetry"));
    public static VarHandle m_yourTelemetry$VH() {
        return ParticipantData.m_yourTelemetry$VH;
    }
    public static byte m_yourTelemetry$get(MemorySegment seg) {
        return (byte)ParticipantData.m_yourTelemetry$VH.get(seg);
    }
    public static void m_yourTelemetry$set( MemorySegment seg, byte x) {
        ParticipantData.m_yourTelemetry$VH.set(seg, x);
    }
    public static byte m_yourTelemetry$get(MemorySegment seg, long index) {
        return (byte)ParticipantData.m_yourTelemetry$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_yourTelemetry$set(MemorySegment seg, long index, byte x) {
        ParticipantData.m_yourTelemetry$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


