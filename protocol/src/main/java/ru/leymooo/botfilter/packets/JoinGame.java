package ru.leymooo.botfilter.packets;

import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import net.md_5.bungee.protocol.AbstractPacketHandler;
import net.md_5.bungee.protocol.DefinedPacket;
import net.md_5.bungee.protocol.ProtocolConstants;


@Data
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class JoinGame extends DefinedPacket
{

    private final int entityId;
    private boolean hardcore = false;
    private short gameMode = 0;
    private short previousGameMode = 0;
    private Set<String> worldNames = new HashSet<>( Arrays.asList( "minecraft:overworld" ) );
    //private Tag dimensions;
    //private Object dimension;
    private String worldName = "minecraft:overworld";
    private long seed = 1;
    private short difficulty = 0;
    private short maxPlayers = 1;
    private String levelType = "flat";
    private int viewDistance = 1;
    private boolean reducedDebugInfo = false;
    private boolean normalRespawn = true;
    private boolean debug = false;
    private boolean flat = true;

    private byte[] dimensions116 = new byte[] {
        10, 0, 0, 9, 0, 9, 100, 105, 109, 101, 110, 115, 105, 111, 110, 10, 0, 0, 0, 1, 1, 0, 11, 112, 105, 103, 108, 105, 110, 95, 115, 97, 102, 101, 0, 1, 0, 7, 110, 97, 116, 117, 114, 97, 108, 1, 5, 0, 13, 97, 109, 98, 105, 101, 110, 116, 95, 108, 105, 103, 104, 116, 0, 0, 0, 0, 8, 0, 10, 105, 110, 102, 105, 110, 105, 98, 117, 114, 110, 0, 30, 109, 105, 110, 101, 99, 114, 97, 102, 116, 58, 105, 110, 102, 105, 110, 105, 98, 117, 114, 110, 95, 111, 118, 101, 114, 119, 111, 114, 108, 100, 1, 0, 20, 114, 101, 115, 112, 97, 119, 110, 95, 97, 110, 99, 104, 111, 114, 95, 119, 111, 114, 107, 115, 0, 1, 0, 12, 104, 97, 115, 95, 115, 107, 121, 108, 105, 103, 104, 116, 1, 1, 0, 9, 98, 101, 100, 95, 119, 111, 114, 107, 115, 1, 4, 0, 10, 102, 105, 120, 101, 100, 95, 116, 105, 109, 101, 0, 0, 0, 0, 0, 0, 39, 16, 8, 0, 4, 110, 97, 109, 101, 0, 19, 109, 105, 110, 101, 99, 114, 97, 102, 116, 58, 111, 118, 101, 114, 119, 111, 114, 108, 100, 1, 0, 9, 104, 97, 115, 95, 114, 97, 105, 100, 115, 1, 1, 0, 6, 115, 104, 114, 117, 110, 107, 0, 1, 0, 14, 108, 111, 103, 105, 99, 97, 108, 95, 104, 101, 105, 103, 104, 116, 0, 1, 0, 11, 104, 97, 115, 95, 99, 101, 105, 108, 105, 110, 103, 0, 1, 0, 9, 117, 108, 116, 114, 97, 119, 97, 114, 109, 0, 0, 0
    };

    private byte[] dimensions1162 = new byte[] {
        31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -19, -111, 77, 78, -60, 48, 12, -123, 93, 96, -104, 105, -7, 17, 18, 44, 88, 113, 5, -10, 92, 38, 114, 27, -73, -75, 38, 113, -86, 36, -99, 106, 110, -113, 67, 17, 101, 51, 91, 86, 100, -109, -40, 121, -78, -65, 103, 55, 0, 13, -68, 122, 22, -22, 34, -10, -7, -61, -78, 39, 73, 28, -60, -28, -13, 68, 7, -72, 41, -41, 101, 65, 13, -69, 19, -70, -103, 26, 0, -88, 84, 45, -24, 9, -98, 55, 117, 56, 81, 92, 66, 116, -10, 26, -82, -40, -86, 72, -69, -19, -55, -111, -42, -56, 21, -44, 45, 89, -93, -33, -57, 84, 85, 112, 55, 98, 50, 29, -79, 99, 25, -32, 22, -98, -70, 16, -94, 101, -63, 76, 38, 117, -24, 8, -66, -113, 42, 39, 30, 84, 101, 18, -10, -92, 97, 61, -69, 28, 113, -63, -24, 53, -72, 47, 85, -46, -15, -20, 120, 24, -77, 18, 53, 44, 61, 11, -73, 115, 20, 120, -37, -72, -74, -84, -7, 65, 60, 40, 89, -33, 83, -105, -45, 5, 7, -113, 46, 12, -84, 40, 102, -92, 82, -67, -96, -20, -32, 1, 125, -53, -22, -58, -72, 53, 87, -78, 117, -127, -120, -56, -74, -8, -38, -85, -123, 57, -94, -45, -25, 75, -92, 52, -31, 34, 6, -91, 27, 67, 92, -83, -81, 67, -7, 53, -31, -81, 110, 3, -55, 123, -53, -63, -1, -81, -32, -113, 86, 0, -97, -24, 61, -20, -6, 10, 3, 0, 0
    };

    private byte[] dimension = new byte[] {
        10, 0, 0, 1, 0, 11, 112, 105, 103, 108, 105, 110, 95, 115, 97, 102, 101, 0, 1, 0, 7, 110, 97, 116, 117, 114, 97, 108, 1, 5, 0, 13, 97, 109, 98, 105, 101, 110, 116, 95, 108, 105, 103, 104, 116, 0, 0, 0, 0, 8, 0, 10, 105, 110, 102, 105, 110, 105, 98, 117, 114, 110, 0, 30, 109, 105, 110, 101, 99, 114, 97, 102, 116, 58, 105, 110, 102, 105, 110, 105, 98, 117, 114, 110, 95, 111, 118, 101, 114, 119, 111, 114, 108, 100, 1, 0, 20, 114, 101, 115, 112, 97, 119, 110, 95, 97, 110, 99, 104, 111, 114, 95, 119, 111, 114, 107, 115, 0, 1, 0, 12, 104, 97, 115, 95, 115, 107, 121, 108, 105, 103, 104, 116, 1, 1, 0, 9, 98, 101, 100, 95, 119, 111, 114, 107, 115, 1, 8, 0, 7, 101, 102, 102, 101, 99, 116, 115, 0, 19, 109, 105, 110, 101, 99, 114, 97, 102, 116, 58, 111, 118, 101, 114, 119, 111, 114, 108, 100, 1, 0, 9, 104, 97, 115, 95, 114, 97, 105, 100, 115, 1, 1, 0, 14, 108, 111, 103, 105, 99, 97, 108, 95, 104, 101, 105, 103, 104, 116, 0, 5, 0, 16, 99, 111, 111, 114, 100, 105, 110, 97, 116, 101, 95, 115, 99, 97, 108, 101, 63, -128, 0, 0, 1, 0, 11, 104, 97, 115, 95, 99, 101, 105, 108, 105, 110, 103, 0, 1, 0, 9, 117, 108, 116, 114, 97, 119, 97, 114, 109, 0, 0
    };
    public JoinGame()
    {
        entityId = 0;
    }

    @Override
    public void read(ByteBuf buf, ProtocolConstants.Direction direction, int protocolVersion)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public void write(ByteBuf buf, ProtocolConstants.Direction direction, int protocolVersion)
    {

        buf.writeInt( entityId );
        if ( protocolVersion >= ProtocolConstants.MINECRAFT_1_16_2 )
        {
            buf.writeBoolean( hardcore );
        }
        buf.writeByte( gameMode );
        if ( protocolVersion >= ProtocolConstants.MINECRAFT_1_16 )
        {
            buf.writeByte( previousGameMode );

            writeVarInt( worldNames.size(), buf );
            for ( String world : worldNames )
            {
                writeString( world, buf );
            }

            if ( protocolVersion >= ProtocolConstants.MINECRAFT_1_16_2 )
            {
                buf.writeBytes( dimensions1162 );
            } else
            {
                buf.writeBytes( dimensions116 );
            }
        }

        if ( protocolVersion >= ProtocolConstants.MINECRAFT_1_16 )
        {
            if ( protocolVersion >= ProtocolConstants.MINECRAFT_1_16_2 )
            {
                buf.writeBytes( dimension );
            } else
            {
                writeString( (String) "minecraft:overworld", buf );
            }
            writeString( worldName, buf );
        } else if ( protocolVersion > ProtocolConstants.MINECRAFT_1_9 )
        {
            buf.writeInt( 0 ); //dim
        } else
        {
            buf.writeByte( 0 ); //dim
        }
        if ( protocolVersion >= ProtocolConstants.MINECRAFT_1_15 )
        {
            buf.writeLong( seed );
        }
        if ( protocolVersion < ProtocolConstants.MINECRAFT_1_14 )
        {
            buf.writeByte( difficulty );
        }
        if ( protocolVersion >= ProtocolConstants.MINECRAFT_1_16_2 )
        {
            writeVarInt( maxPlayers, buf );
        } else
        {
            buf.writeByte( maxPlayers );
        }
        if ( protocolVersion < ProtocolConstants.MINECRAFT_1_16 )
        {
            writeString( levelType, buf );
        }
        if ( protocolVersion >= ProtocolConstants.MINECRAFT_1_14 )
        {
            writeVarInt( viewDistance, buf );
        }
        if ( protocolVersion >= 29 )
        {
            buf.writeBoolean( reducedDebugInfo );
        }
        if ( protocolVersion >= ProtocolConstants.MINECRAFT_1_15 )
        {
            buf.writeBoolean( normalRespawn );
        }
        if ( protocolVersion >= ProtocolConstants.MINECRAFT_1_16 )
        {
            buf.writeBoolean( debug );
            buf.writeBoolean( flat );
        }

    }

    @Override
    public void handle(AbstractPacketHandler handler) throws Exception
    {
        throw new UnsupportedOperationException();
    }
}
