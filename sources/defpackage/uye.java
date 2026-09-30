package defpackage;

import com.adjust.sdk.sig.r3;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uye extends lt0 {
    public final /* synthetic */ int i;

    public /* synthetic */ uye(int i) {
        this.i = i;
    }

    public static void n(int i, ByteBuffer byteBuffer) {
        float f = (float) (((double) i) * 4.656612875245797E-10d);
        byteBuffer.putInt(Float.isNaN(f) ? 0 : Float.floatToIntBits(f));
    }

    @Override // defpackage.lt0
    public final wj0 a(wj0 wj0Var) throws zj0 {
        switch (this.i) {
            case 0:
                int i = wj0Var.c;
                if (pqf.E(i)) {
                    return i != 4 ? new wj0(wj0Var.a, wj0Var.b, 4) : wj0.e;
                }
                throw new zj0(wj0Var);
            default:
                int i2 = wj0Var.c;
                if (pqf.E(i2)) {
                    return i2 != 2 ? new wj0(wj0Var.a, wj0Var.b, 2) : wj0.e;
                }
                throw new zj0(wj0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0050  */
    @Override // defpackage.ak0
    public final void f(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferM;
        switch (this.i) {
            case 0:
                int iPosition = byteBuffer.position();
                int iLimit = byteBuffer.limit();
                int i = iLimit - iPosition;
                int i2 = this.b.c;
                if (i2 == 2) {
                    byteBufferM = m(i * 2);
                    while (iPosition < iLimit) {
                        n(byteBuffer.getShort(iPosition) << 16, byteBufferM);
                        iPosition += 2;
                    }
                } else if (i2 == 3) {
                    byteBufferM = m(i * 4);
                    while (iPosition < iLimit) {
                        n(((byteBuffer.get(iPosition) & 255) - 128) << 24, byteBufferM);
                        iPosition++;
                    }
                } else if (i2 == 21) {
                    byteBufferM = m((i / 3) * 4);
                    while (iPosition < iLimit) {
                        n(rxg.F(byteBuffer.get(iPosition + 2), byteBuffer.get(iPosition + 1), byteBuffer.get(iPosition), (byte) 0), byteBufferM);
                        iPosition += 3;
                    }
                } else if (i2 == 22) {
                    byteBufferM = m(i);
                    while (iPosition < iLimit) {
                        n(byteBuffer.getInt(iPosition), byteBufferM);
                        iPosition += 4;
                    }
                } else if (i2 == 268435456) {
                    byteBufferM = m(i * 2);
                    while (iPosition < iLimit) {
                        n(Short.reverseBytes(byteBuffer.getShort(iPosition)) << 16, byteBufferM);
                        iPosition += 2;
                    }
                } else if (i2 == 1342177280) {
                    byteBufferM = m((i / 3) * 4);
                    while (iPosition < iLimit) {
                        n(rxg.F(byteBuffer.get(iPosition), byteBuffer.get(iPosition + 1), byteBuffer.get(iPosition + 2), (byte) 0), byteBufferM);
                        iPosition += 3;
                    }
                } else if (i2 == 1610612736) {
                    byteBufferM = m(i);
                    while (iPosition < iLimit) {
                        n(Integer.reverseBytes(byteBuffer.getInt(iPosition)), byteBufferM);
                        iPosition += 4;
                    }
                } else if (i2 == 1879048192) {
                    byteBufferM = m(i / 2);
                    while (iPosition < iLimit) {
                        byteBufferM.putFloat((float) byteBuffer.getDouble(iPosition));
                        iPosition += 8;
                    }
                } else if (i2 == 1895825408) {
                    byteBufferM = m(i);
                    while (iPosition < iLimit) {
                        byteBufferM.putFloat(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt(iPosition))));
                        iPosition += 4;
                    }
                } else if (i2 != 1912602624) {
                    r3.l();
                } else {
                    byteBufferM = m(i / 2);
                    while (iPosition < iLimit) {
                        byteBufferM.putFloat((float) Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong(iPosition))));
                        iPosition += 8;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                byteBufferM.flip();
                break;
            default:
                int iPosition2 = byteBuffer.position();
                int iLimit2 = byteBuffer.limit();
                int i3 = iLimit2 - iPosition2;
                int i4 = this.b.c;
                if (i4 == 3) {
                    i3 *= 2;
                } else if (i4 == 4) {
                    i3 /= 2;
                } else if (i4 == 21) {
                    i3 = (i3 / 3) * 2;
                } else if (i4 == 22) {
                    i3 /= 2;
                } else if (i4 != 268435456) {
                    if (i4 == 1342177280) {
                        i3 = (i3 / 3) * 2;
                    } else if (i4 == 1610612736) {
                        i3 /= 2;
                    } else {
                        if (i4 != 1879048192) {
                            if (i4 == 1895825408) {
                                i3 /= 2;
                            } else if (i4 != 1912602624) {
                                r3.l();
                            }
                        }
                        i3 /= 4;
                    }
                }
                ByteBuffer byteBufferM2 = m(i3);
                int i5 = this.b.c;
                if (i5 == 3) {
                    while (iPosition2 < iLimit2) {
                        byteBufferM2.put((byte) 0);
                        byteBufferM2.put((byte) ((byteBuffer.get(iPosition2) & 255) - 128));
                        iPosition2++;
                    }
                } else if (i5 == 4) {
                    while (iPosition2 < iLimit2) {
                        short sG = (short) (pqf.g(byteBuffer.getFloat(iPosition2), -1.0f, 1.0f) * 32767.0f);
                        byteBufferM2.put((byte) (sG & 255));
                        byteBufferM2.put((byte) ((sG >> 8) & 255));
                        iPosition2 += 4;
                    }
                } else if (i5 == 21) {
                    while (iPosition2 < iLimit2) {
                        byteBufferM2.put(byteBuffer.get(iPosition2 + 1));
                        byteBufferM2.put(byteBuffer.get(iPosition2 + 2));
                        iPosition2 += 3;
                    }
                } else if (i5 == 22) {
                    while (iPosition2 < iLimit2) {
                        byteBufferM2.put(byteBuffer.get(iPosition2 + 2));
                        byteBufferM2.put(byteBuffer.get(iPosition2 + 3));
                        iPosition2 += 4;
                    }
                } else if (i5 == 268435456) {
                    while (iPosition2 < iLimit2) {
                        byteBufferM2.put(byteBuffer.get(iPosition2 + 1));
                        byteBufferM2.put(byteBuffer.get(iPosition2));
                        iPosition2 += 2;
                    }
                } else if (i5 == 1342177280) {
                    while (iPosition2 < iLimit2) {
                        byteBufferM2.put(byteBuffer.get(iPosition2 + 1));
                        byteBufferM2.put(byteBuffer.get(iPosition2));
                        iPosition2 += 3;
                    }
                } else if (i5 == 1610612736) {
                    while (iPosition2 < iLimit2) {
                        byteBufferM2.put(byteBuffer.get(iPosition2 + 1));
                        byteBufferM2.put(byteBuffer.get(iPosition2));
                        iPosition2 += 4;
                    }
                } else if (i5 == 1879048192) {
                    while (iPosition2 < iLimit2) {
                        short sMax = (short) (Math.max(-1.0d, Math.min(byteBuffer.getDouble(iPosition2), 1.0d)) * 32767.0d);
                        byteBufferM2.put((byte) (sMax & 255));
                        byteBufferM2.put((byte) ((sMax >> 8) & 255));
                        iPosition2 += 8;
                    }
                } else if (i5 == 1895825408) {
                    while (iPosition2 < iLimit2) {
                        short sG2 = (short) (pqf.g(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt(iPosition2))), -1.0f, 1.0f) * 32767.0f);
                        byteBufferM2.put((byte) (sG2 & 255));
                        byteBufferM2.put((byte) ((sG2 >> 8) & 255));
                        iPosition2 += 4;
                    }
                } else if (i5 != 1912602624) {
                    r3.l();
                } else {
                    while (iPosition2 < iLimit2) {
                        short sMax2 = (short) (Math.max(-1.0d, Math.min(Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong(iPosition2))), 1.0d)) * 32767.0d);
                        byteBufferM2.put((byte) (sMax2 & 255));
                        byteBufferM2.put((byte) ((sMax2 >> 8) & 255));
                        iPosition2 += 8;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                byteBufferM2.flip();
                break;
        }
    }
}
