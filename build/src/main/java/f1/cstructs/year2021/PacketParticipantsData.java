// Generated by jextract

package f1.cstructs.year2021;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class PacketParticipantsData {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("m_packetFormat"),
            Constants$root.C_CHAR$LAYOUT.withName("m_gameMajorVersion"),
            Constants$root.C_CHAR$LAYOUT.withName("m_gameMinorVersion"),
            Constants$root.C_CHAR$LAYOUT.withName("m_packetVersion"),
            Constants$root.C_CHAR$LAYOUT.withName("m_packetId"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("m_sessionUID"),
            Constants$root.C_FLOAT$LAYOUT.withName("m_sessionTime"),
            Constants$root.C_INT$LAYOUT.withName("m_frameIdentifier"),
            Constants$root.C_CHAR$LAYOUT.withName("m_playerCarIndex"),
            Constants$root.C_CHAR$LAYOUT.withName("m_secondaryPlayerCarIndex")
        ).withName("m_header"),
        Constants$root.C_CHAR$LAYOUT.withName("m_numActiveCars"),
        MemoryLayout.sequenceLayout(22, MemoryLayout.structLayout(
            Constants$root.C_CHAR$LAYOUT.withName("m_aiControlled"),
            Constants$root.C_CHAR$LAYOUT.withName("m_driverId"),
            Constants$root.C_CHAR$LAYOUT.withName("m_networkId"),
            Constants$root.C_CHAR$LAYOUT.withName("m_teamId"),
            Constants$root.C_CHAR$LAYOUT.withName("m_myTeam"),
            Constants$root.C_CHAR$LAYOUT.withName("m_raceNumber"),
            Constants$root.C_CHAR$LAYOUT.withName("m_nationality"),
            MemoryLayout.sequenceLayout(48, Constants$root.C_CHAR$LAYOUT).withName("m_name"),
            Constants$root.C_CHAR$LAYOUT.withName("m_yourTelemetry")
        ).withName("ParticipantData")).withName("m_participants")
    ).withName("PacketParticipantsData");
    public static MemoryLayout $LAYOUT() {
        return PacketParticipantsData.$struct$LAYOUT;
    }
    public static MemorySegment m_header$slice(MemorySegment seg) {
        return seg.asSlice(0, 24);
    }
    static final VarHandle m_numActiveCars$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_numActiveCars"));
    public static VarHandle m_numActiveCars$VH() {
        return PacketParticipantsData.m_numActiveCars$VH;
    }
    public static byte m_numActiveCars$get(MemorySegment seg) {
        return (byte)PacketParticipantsData.m_numActiveCars$VH.get(seg);
    }
    public static void m_numActiveCars$set( MemorySegment seg, byte x) {
        PacketParticipantsData.m_numActiveCars$VH.set(seg, x);
    }
    public static byte m_numActiveCars$get(MemorySegment seg, long index) {
        return (byte)PacketParticipantsData.m_numActiveCars$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_numActiveCars$set(MemorySegment seg, long index, byte x) {
        PacketParticipantsData.m_numActiveCars$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment m_participants$slice(MemorySegment seg) {
        return seg.asSlice(25, 1232);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

