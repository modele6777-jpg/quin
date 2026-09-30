package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import io.sentry.android.core.b1;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yl9 implements z21, ac0, sl9, rsf {
    public static final byte[] e = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};
    public static final byte[] f = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public Object d;

    public yl9(n49 n49Var, rr5 rr5Var) {
        this.a = 1;
        d0a d0aVar = n49Var.c;
        this.d = d0aVar;
        d0aVar.M(12);
        int iD = d0aVar.D();
        if ("audio/raw".equals(rr5Var.p)) {
            int iQ = pqf.q(rr5Var.M) * rr5Var.J;
            if (iD % iQ != 0) {
                xo1.V("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iQ + ", stsz sample size: " + iD);
                iD = iQ;
            }
        }
        this.b = iD == 0 ? -1 : iD;
        this.c = d0aVar.D();
    }

    public static void y(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(ndc.a(i2));
    }

    public synchronized int A() {
        PackageInfo packageInfoB;
        if (this.b == 0) {
            try {
                packageInfoB = rcg.a((Context) this.d).b(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e2) {
                b1.l("Metadata", "Failed to find package ".concat(e2.toString()));
                packageInfoB = null;
            }
            if (packageInfoB != null) {
                this.b = packageInfoB.versionCode;
            }
        }
        return this.b;
    }

    @Override // defpackage.ac0
    public void a(int i, Object obj) {
        ((ac0) this.d).a(i + (this.c == 0 ? this.b : 0), obj);
    }

    @Override // defpackage.ac0
    public void d(Object obj) {
        this.c++;
        ((ac0) this.d).d(obj);
    }

    @Override // defpackage.ac0
    public void e() {
        ((ac0) this.d).e();
    }

    @Override // defpackage.ac0
    public void f(int i, int i2, int i3) {
        int i4 = this.c == 0 ? this.b : 0;
        ((ac0) this.d).f(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.ac0
    public void g(int i, int i2) {
        ((ac0) this.d).g(i + (this.c == 0 ? this.b : 0), i2);
    }

    @Override // defpackage.z21
    public int h() {
        return this.b;
    }

    @Override // defpackage.psf
    public b00 i(long j, b00 b00Var, b00 b00Var2, b00 b00Var3) {
        return ((kxa) this.d).i(j, b00Var, b00Var2, b00Var3);
    }

    @Override // defpackage.sl9
    public int j(int i) {
        int iJ = ((sl9) this.d).j(i);
        if (i >= 0 && i <= this.c) {
            mrf.c(iJ, this.b, i);
        }
        return iJ;
    }

    @Override // defpackage.ac0
    public void k(l26 l26Var, Object obj) {
        ((ac0) this.d).k(l26Var, obj);
    }

    @Override // defpackage.ac0
    public void l() {
        if (this.c <= 0) {
            wf2.a("OffsetApplier up called with no corresponding down");
        }
        this.c--;
        ((ac0) this.d).l();
    }

    @Override // defpackage.ac0
    public void m(int i, Object obj) {
        ((ac0) this.d).m(i + (this.c == 0 ? this.b : 0), obj);
    }

    @Override // defpackage.ac0
    public Object o() {
        return ((ac0) this.d).o();
    }

    @Override // defpackage.rsf
    public int p() {
        return this.c;
    }

    @Override // defpackage.z21
    public int q() {
        return this.c;
    }

    @Override // defpackage.z21
    public int r() {
        int i = this.b;
        return i == -1 ? ((d0a) this.d).D() : i;
    }

    @Override // defpackage.rsf
    public int s() {
        return this.b;
    }

    @Override // defpackage.psf
    public b00 t(long j, b00 b00Var, b00 b00Var2, b00 b00Var3) {
        return ((kxa) this.d).t(j, b00Var, b00Var2, b00Var3);
    }

    public String toString() {
        switch (this.a) {
            case 2:
                int i = this.b;
                int i2 = this.c;
                StringBuilder sb = new StringBuilder((i * 2 * i2) + 2);
                for (int i3 = 0; i3 < i2; i3++) {
                    byte[] bArr = ((byte[][]) this.d)[i3];
                    for (int i4 = 0; i4 < i; i4++) {
                        byte b = bArr[i4];
                        if (b == 0) {
                            sb.append(" 0");
                        } else if (b != 1) {
                            sb.append("  ");
                        } else {
                            sb.append(" 1");
                        }
                    }
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.sl9
    public int v(int i) {
        int iV = ((sl9) this.d).v(i);
        if (i >= 0 && i <= this.b) {
            mrf.b(iV, this.c, i);
        }
        return iV;
    }

    public byte w(int i, int i2) {
        return ((byte[][]) this.d)[i2][i];
    }

    public void x(int i, int i2, int i3) {
        ((byte[][]) this.d)[i2][i] = (byte) i3;
    }

    public synchronized int z() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        Context context = (Context) this.d;
        PackageManager packageManager = context.getPackageManager();
        if (rcg.a(context).a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            b1.d("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers != null && !listQueryBroadcastReceivers.isEmpty()) {
            this.c = 2;
            return 2;
        }
        b1.l("Metadata", "Failed to resolve IID implementation package, falling back");
        this.c = 2;
        return 2;
    }

    public /* synthetic */ yl9(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
        this.d = obj;
    }

    public yl9(int i, int i2, int i3) {
        this.a = i3;
        switch (i3) {
            case 4:
                this.d = null;
                this.b = i;
                int i4 = i2 & 7;
                this.c = i4 == 0 ? 8 : i4;
                break;
            default:
                this.d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
                this.b = i;
                this.c = i2;
                break;
        }
    }

    public yl9(sl9 sl9Var, int i, int i2) {
        this.a = 7;
        this.d = sl9Var;
        this.b = i;
        this.c = i2;
    }

    public yl9(ac0 ac0Var, int i) {
        this.a = 5;
        this.d = ac0Var;
        this.b = i;
    }

    public yl9(int i) {
        this.a = i;
        switch (i) {
            case 4:
                this.d = new yl9[256];
                this.b = 0;
                this.c = 0;
                break;
        }
    }

    public yl9(int i, int i2, fs4 fs4Var) {
        this.a = 8;
        this.b = i;
        this.c = i2;
        this.d = new kxa(new uj5(i, i2, fs4Var));
    }

    public yl9(Context context) {
        this.a = 9;
        this.c = 0;
        this.d = context;
    }
}
