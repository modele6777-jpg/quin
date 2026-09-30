package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mib implements aw6 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(mib.class, "f");
    public final hib a;
    public final qn2 b;
    public final kv c;
    public final a90 d;
    public final ec2 e;
    public volatile /* synthetic */ int f;

    public mib(hib hibVar) {
        this.a = hibVar;
        int i = 1;
        this.b = jgb.k(i7h.I(iqf.d(), new eq5(qk6.w, i)));
        kv kvVar = new kv();
        kvVar.b = new WeakReference(this);
        kvVar.c = new jv(kvVar, this);
        kvVar.d = new gs(i, kvVar);
        this.c = kvVar;
        a90 a90Var = new a90(this);
        this.d = a90Var;
        a82 a82Var = new a82(hibVar.g);
        ArrayList arrayList = (ArrayList) a82Var.b;
        ArrayList arrayList2 = (ArrayList) a82Var.e;
        ArrayList arrayList3 = (ArrayList) a82Var.d;
        ArrayList arrayList4 = (ArrayList) a82Var.f;
        qw6 qw6Var = hibVar.b;
        Object obj = qw6Var.n.a.get(bw6.a);
        int i2 = 29;
        if (((Boolean) (obj == null ? Boolean.TRUE : obj)).booleanValue()) {
            arrayList2.add(new i7b(28));
            arrayList4.add(new i7b(i2));
        }
        int i3 = 0;
        qw qwVar = new qw(i3);
        kob kobVar = job.a;
        a82Var.k(qwVar, kobVar.b(Uri.class));
        a82Var.k(new qw(3), kobVar.b(Integer.class));
        arrayList3.add(new iy9(new uu(0), kobVar.b(qhf.class)));
        a82Var.o(new xe0(i3), kobVar.b(qhf.class));
        a82Var.o(new xe0(4), kobVar.b(qhf.class));
        a82Var.o(new xe0(9), kobVar.b(qhf.class));
        a82Var.o(new xe0(6), kobVar.b(Drawable.class));
        q95 q95Var = cw6.a;
        Object obj2 = qw6Var.n.a.get(cw6.a);
        int iIntValue = ((Number) (obj2 == null ? 4 : obj2)).intValue();
        int i4 = oxc.a;
        nxc nxcVar = new nxc(iIntValue);
        int i5 = Build.VERSION.SDK_INT;
        Object obj3 = t35.a;
        if (i5 >= 29) {
            Object obj4 = qw6Var.n.a.get(cw6.c);
            if (((Boolean) (obj4 == null ? Boolean.TRUE : obj4)).booleanValue()) {
                Object obj5 = qw6Var.n.a.get(cw6.b);
                if (((t35) (obj5 == null ? obj3 : obj5)).equals(obj3)) {
                    arrayList4.add(new dc2(new l1e(nxcVar), i3));
                }
            }
        }
        Object obj6 = qw6Var.n.a.get(cw6.b);
        arrayList4.add(new dc2(new zy0(nxcVar, (t35) (obj6 != null ? obj6 : obj3)), i3));
        a82Var.k(new qw(1), kobVar.b(File.class));
        a82Var.o(new xe0(8), kobVar.b(qhf.class));
        a82Var.o(new xe0(3), kobVar.b(ByteBuffer.class));
        a82Var.k(new qw(4), kobVar.b(String.class));
        int i6 = 2;
        a82Var.k(new qw(i6), kobVar.b(e1a.class));
        arrayList3.add(new iy9(new uu(1), kobVar.b(qhf.class)));
        arrayList3.add(new iy9(new uu(2), kobVar.b(qhf.class)));
        a82Var.o(new xe0(7), kobVar.b(qhf.class));
        a82Var.o(new xe0(i6), kobVar.b(byte[].class));
        a82Var.o(new xe0(5), kobVar.b(qhf.class));
        a82Var.o(new xe0(1), kobVar.b(Bitmap.class));
        arrayList.add(new sv4(this, kvVar, a90Var));
        this.e = new ec2(vpf.T(arrayList), vpf.T((ArrayList) a82Var.c), vpf.T(arrayList3), vpf.T(arrayList2), vpf.T(arrayList4));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e7 A[Catch: all -> 0x0056, TryCatch #2 {all -> 0x0056, blocks: (B:15:0x0051, B:92:0x01c2, B:94:0x01c8, B:101:0x01ed, B:97:0x01d4, B:100:0x01e7, B:102:0x01f4, B:104:0x01f8, B:107:0x0204, B:108:0x0209), top: B:128:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x01f4 A[Catch: all -> 0x0056, TryCatch #2 {all -> 0x0056, blocks: (B:15:0x0051, B:92:0x01c2, B:94:0x01c8, B:101:0x01ed, B:97:0x01d4, B:100:0x01e7, B:102:0x01f4, B:104:0x01f8, B:107:0x0204, B:108:0x0209), top: B:128:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x01f8 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #2 {all -> 0x0056, blocks: (B:15:0x0051, B:92:0x01c2, B:94:0x01c8, B:101:0x01ed, B:97:0x01d4, B:100:0x01e7, B:102:0x01f4, B:104:0x01f8, B:107:0x0204, B:108:0x0209), top: B:128:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0204 A[Catch: all -> 0x0056, TRY_ENTER, TryCatch #2 {all -> 0x0056, blocks: (B:15:0x0051, B:92:0x01c2, B:94:0x01c8, B:101:0x01ed, B:97:0x01d4, B:100:0x01e7, B:102:0x01f4, B:104:0x01f8, B:107:0x0204, B:108:0x0209), top: B:128:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x021c A[Catch: all -> 0x0229, TRY_LEAVE, TryCatch #3 {all -> 0x0229, blocks: (B:113:0x0218, B:115:0x021c, B:120:0x022b, B:121:0x0231), top: B:129:0x0218 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x022b A[Catch: all -> 0x0229, TRY_ENTER, TryCatch #3 {all -> 0x0229, blocks: (B:113:0x0218, B:115:0x021c, B:120:0x022b, B:121:0x0231), top: B:129:0x0218 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x015e A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:29:0x009b, B:78:0x0157, B:80:0x015e, B:82:0x0168, B:83:0x0172, B:84:0x0175), top: B:124:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0168 A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:29:0x009b, B:78:0x0157, B:80:0x015e, B:82:0x0168, B:83:0x0172, B:84:0x0175), top: B:124:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0191  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:91:0x01be  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c8 A[Catch: all -> 0x0056, TryCatch #2 {all -> 0x0056, blocks: (B:15:0x0051, B:92:0x01c2, B:94:0x01c8, B:101:0x01ed, B:97:0x01d4, B:100:0x01e7, B:102:0x01f4, B:104:0x01f8, B:107:0x0204, B:108:0x0209), top: B:128:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d4 A[Catch: all -> 0x0056, TryCatch #2 {all -> 0x0056, blocks: (B:15:0x0051, B:92:0x01c2, B:94:0x01c8, B:101:0x01ed, B:97:0x01d4, B:100:0x01e7, B:102:0x01f4, B:104:0x01f8, B:107:0x0204, B:108:0x0209), top: B:128:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01e6  */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0149, code lost:
    
        if (r4.c(r7) == r10) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.sw6 r16, int r17, defpackage.zn2 r18) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mib.a(sw6, int, zn2):java.lang.Object");
    }

    public final Object b(sw6 sw6Var, zn2 zn2Var) {
        hfe hfeVar = sw6Var.c;
        return ((sw6Var.o instanceof vib) || ((h48) b21.z(sw6Var, yw6.e)) != null) ? jgb.O(new jib(this, sw6Var, null), zn2Var) : a(sw6Var, 1, zn2Var);
    }

    public final qib c() {
        return (qib) this.a.d.getValue();
    }

    public final void d(ly4 ly4Var, hfe hfeVar, uz4 uz4Var) {
        sw6 sw6Var = ly4Var.b;
        if (hfeVar instanceof ah0) {
            m3f m3fVarA = ((h3f) b21.z(sw6Var, yw6.a)).a((ah0) hfeVar, ly4Var);
            if (!(m3fVarA instanceof qg9)) {
                uz4Var.getClass();
                m3fVarA.a();
            }
        }
        uz4Var.getClass();
        sw6Var.getClass();
    }

    public final void e() {
        if (g.getAndSet(this, 1) == 1) {
            return;
        }
        jgb.I(this.b, null);
        this.c.g();
        qib qibVarC = c();
        if (qibVarC != null) {
            qibVarC.a();
        }
    }
}
