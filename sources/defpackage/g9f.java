package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g9f {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final szc b;
    public volatile int c = 0;

    public g9f(szc szcVar, int i) {
        this.b = szcVar;
        this.a = i;
    }

    public final int a(int i) {
        av8 av8VarB = b();
        int iB = av8VarB.b(16);
        if (iB == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) av8VarB.d;
        int i2 = iB + av8VarB.a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final av8 b() {
        ThreadLocal threadLocal = d;
        av8 av8Var = (av8) threadLocal.get();
        if (av8Var == null) {
            av8Var = new av8();
            threadLocal.set(av8Var);
        }
        bv8 bv8Var = (bv8) this.b.b;
        int iB = bv8Var.b(6);
        if (iB != 0) {
            int i = iB + bv8Var.a;
            int i2 = (this.a * 4) + ((ByteBuffer) bv8Var.d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) bv8Var.d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) bv8Var.d;
            av8Var.d = byteBuffer;
            if (byteBuffer != null) {
                av8Var.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                av8Var.b = i4;
                av8Var.c = ((ByteBuffer) av8Var.d).getShort(i4);
                return av8Var;
            }
            av8Var.a = 0;
            av8Var.b = 0;
            av8Var.c = 0;
        }
        return av8Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        av8 av8VarB = b();
        int iB = av8VarB.b(4);
        sb.append(Integer.toHexString(iB != 0 ? ((ByteBuffer) av8VarB.d).getInt(iB + av8VarB.a) : 0));
        sb.append(", codepoints:");
        av8 av8VarB2 = b();
        int iB2 = av8VarB2.b(16);
        if (iB2 != 0) {
            int i2 = iB2 + av8VarB2.a;
            i = ((ByteBuffer) av8VarB2.d).getInt(((ByteBuffer) av8VarB2.d).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
