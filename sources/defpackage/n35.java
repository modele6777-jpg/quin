package defpackage;

import io.sentry.android.core.b1;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n35 {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public n35(long j, byte[] bArr, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }

    public static n35 a(String str) {
        byte[] bytes = str.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(r35.O);
        return new n35(bytes, 2, bytes.length);
    }

    public static n35 b(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[r35.F[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j2 : jArr) {
            byteBufferWrap.putInt((int) j2);
        }
        return new n35(byteBufferWrap.array(), 4, jArr.length);
    }

    public static n35 c(p35[] p35VarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[r35.F[5] * p35VarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (p35 p35Var : p35VarArr) {
            byteBufferWrap.putInt((int) p35Var.a);
            byteBufferWrap.putInt((int) p35Var.b);
        }
        return new n35(byteBufferWrap.array(), 5, p35VarArr.length);
    }

    public static n35 d(int i, ByteOrder byteOrder) {
        int[] iArr = {i};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[r35.F[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i2 : iArr) {
            byteBufferWrap.putShort((short) i2);
        }
        return new n35(byteBufferWrap.array(), 3, iArr.length);
    }

    public final double e(ByteOrder byteOrder) {
        Object objH = h(byteOrder);
        if (objH == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objH instanceof String) {
            return Double.parseDouble((String) objH);
        }
        if (objH instanceof long[]) {
            long[] jArr = (long[]) objH;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objH instanceof int[]) {
            int[] iArr = (int[]) objH;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objH instanceof double[]) {
            double[] dArr = (double[]) objH;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objH instanceof p35[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        p35[] p35VarArr = (p35[]) objH;
        if (p35VarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        p35 p35Var = p35VarArr[0];
        return p35Var.a / p35Var.b;
    }

    public final int f(ByteOrder byteOrder) throws Throwable {
        Object objH = h(byteOrder);
        if (objH == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objH instanceof String) {
            return Integer.parseInt((String) objH);
        }
        if (objH instanceof long[]) {
            long[] jArr = (long[]) objH;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objH instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objH;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String g(ByteOrder byteOrder) throws Throwable {
        Object objH = h(byteOrder);
        if (objH == null) {
            return null;
        }
        if (objH instanceof String) {
            return (String) objH;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objH instanceof long[]) {
            long[] jArr = (long[]) objH;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objH instanceof int[]) {
            int[] iArr = (int[]) objH;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objH instanceof double[]) {
            double[] dArr = (double[]) objH;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objH instanceof p35[])) {
            return null;
        }
        p35[] p35VarArr = (p35[]) objH;
        while (i < p35VarArr.length) {
            sb.append(p35VarArr[i].a);
            sb.append('/');
            sb.append(p35VarArr[i].b);
            i++;
            if (i != p35VarArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:17:0x0032 */
    /* JADX WARN: Type inference failed for: r13v14, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v15, types: [long[]] */
    /* JADX WARN: Type inference failed for: r13v16, types: [p35[]] */
    /* JADX WARN: Type inference failed for: r13v17, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v18, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v19, types: [p35[]] */
    /* JADX WARN: Type inference failed for: r13v20, types: [double[]] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v22, types: [double[]] */
    public final Serializable h(ByteOrder byteOrder) throws Throwable {
        m35 m35Var;
        InputStream inputStream;
        String str;
        byte b;
        ?? r13;
        byte[] bArr = this.d;
        InputStream inputStream2 = null;
        try {
            try {
                m35Var = new m35(bArr);
                try {
                    m35Var.c = byteOrder;
                    int i = this.a;
                    int length = 0;
                    int i2 = this.b;
                    switch (i) {
                        case 1:
                        case 6:
                            if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                                str = new String(bArr, r35.O);
                                try {
                                    m35Var.close();
                                    return str;
                                } catch (IOException e) {
                                    b1.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                    return str;
                                }
                            }
                            String str2 = new String(new char[]{(char) (b + 48)});
                            try {
                                m35Var.close();
                                return str2;
                            } catch (IOException e2) {
                                b1.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                return str2;
                            }
                        case 2:
                        case 7:
                            if (i2 >= r35.G.length) {
                                int i3 = 0;
                                while (true) {
                                    byte[] bArr2 = r35.G;
                                    if (i3 >= bArr2.length) {
                                        length = bArr2.length;
                                    } else if (bArr[i3] == bArr2[i3]) {
                                        i3++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (length < i2) {
                                byte b2 = bArr[length];
                                if (b2 == 0) {
                                    str = sb.toString();
                                    m35Var.close();
                                    return str;
                                }
                                if (b2 >= 32) {
                                    sb.append((char) b2);
                                } else {
                                    sb.append('?');
                                }
                                length++;
                            }
                            str = sb.toString();
                            m35Var.close();
                            return str;
                        case 3:
                            r13 = new int[i2];
                            while (length < i2) {
                                r13[length] = m35Var.readUnsignedShort();
                                length++;
                            }
                            try {
                                m35Var.close();
                                return r13;
                            } catch (IOException e3) {
                                b1.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                return r13;
                            }
                        case 4:
                            r13 = new long[i2];
                            while (length < i2) {
                                r13[length] = ((long) m35Var.readInt()) & 4294967295L;
                                length++;
                            }
                            m35Var.close();
                            return r13;
                        case 5:
                            r13 = new p35[i2];
                            while (length < i2) {
                                r13[length] = new p35(((long) m35Var.readInt()) & 4294967295L, ((long) m35Var.readInt()) & 4294967295L);
                                length++;
                            }
                            m35Var.close();
                            return r13;
                        case 8:
                            r13 = new int[i2];
                            while (length < i2) {
                                r13[length] = m35Var.readShort();
                                length++;
                            }
                            m35Var.close();
                            return r13;
                        case 9:
                            r13 = new int[i2];
                            while (length < i2) {
                                r13[length] = m35Var.readInt();
                                length++;
                            }
                            m35Var.close();
                            return r13;
                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                            r13 = new p35[i2];
                            while (length < i2) {
                                r13[length] = new p35(m35Var.readInt(), m35Var.readInt());
                                length++;
                            }
                            m35Var.close();
                            return r13;
                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                            r13 = new double[i2];
                            while (length < i2) {
                                r13[length] = m35Var.readFloat();
                                length++;
                            }
                            m35Var.close();
                            return r13;
                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                            r13 = new double[i2];
                            while (length < i2) {
                                r13[length] = m35Var.readDouble();
                                length++;
                            }
                            m35Var.close();
                            return r13;
                        default:
                            try {
                                m35Var.close();
                                return null;
                            } catch (IOException e4) {
                                b1.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                return null;
                            }
                    }
                } catch (IOException e5) {
                    e = e5;
                    b1.n("ExifInterface", "IOException occurred during reading a value", e);
                    if (m35Var != null) {
                        try {
                            m35Var.close();
                        } catch (IOException e6) {
                            b1.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                        }
                    }
                    return null;
                }
            } catch (IOException e7) {
                e = e7;
                m35Var = null;
            } catch (Throwable th) {
                th = th;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e8) {
                        b1.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(r35.E[this.a]);
        sb.append(", data length:");
        return tec.g(this.d.length, ")", sb);
    }

    public n35(byte[] bArr, int i, int i2) {
        this(-1L, bArr, i, i2);
    }
}
