package defpackage;

import ai.askquin.datastore.model.RatingConditionRecord;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.ImageReader;
import androidx.camera.core.ImageProcessingUtil;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yx4 implements n95, g1b, f1b, ut7, czc, fy2, ahc, ntd {
    public final /* synthetic */ int a;

    public yx4(szc szcVar) {
        this.a = 2;
    }

    public static ArrayList c(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((a1b) obj) != a1b.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((a1b) it.next()).toString());
        }
        return arrayList2;
    }

    public static byte[] f(List list) {
        f41 f41Var = new f41();
        for (String str : c(list)) {
            f41Var.i1(str.length());
            f41Var.n1(str);
        }
        return f41Var.k0(f41Var.b);
    }

    public static kpb h(String str) {
        Object next;
        mx4 mx4Var = kpb.c;
        mx4Var.getClass();
        l2 l2Var = new l2(0, mx4Var);
        while (l2Var.hasNext()) {
            next = l2Var.next();
            if (pa7.t(((kpb) next).a(), str)) {
                return (kpb) next;
            }
        }
        next = null;
        return (kpb) next;
    }

    public static Instant i(String str) {
        if (str != null) {
            return Instant.parse(str);
        }
        return null;
    }

    public static znc k(String str) {
        Object next;
        str.getClass();
        mx4 mx4Var = znc.f;
        mx4Var.getClass();
        l2 l2Var = new l2(0, mx4Var);
        while (l2Var.hasNext()) {
            next = l2Var.next();
            if (pa7.t(((znc) next).a(), str)) {
                return (znc) next;
            }
        }
        next = null;
        return (znc) next;
    }

    public static String m(Instant instant) {
        if (instant != null) {
            return instant.toString();
        }
        return null;
    }

    @Override // defpackage.czc
    public Object B(FileInputStream fileInputStream) {
        return fzc.a.b(RatingConditionRecord.Companion.serializer(), new String(lmg.p0(fileInputStream), ox1.a));
    }

    @Override // defpackage.ut7
    public boolean a(j7f j7fVar, j7f j7fVar2) {
        return j7fVar.equals(j7fVar2);
    }

    public Object d(Object obj) throws Throwable {
        UnsupportedOperationException unsupportedOperationException;
        Throwable th;
        Bitmap bitmapCreateBitmap;
        sp0 sp0Var = (sp0) obj;
        int i = sp0Var.c;
        Object obj2 = sp0Var.a;
        int i2 = sp0Var.f;
        sbc sbcVar = null;
        try {
            try {
                if (i == 35) {
                    iw6 iw6Var = (iw6) obj2;
                    boolean z = i2 % 180 != 0;
                    sbc sbcVar2 = new sbc(new egh(ImageReader.newInstance(z ? iw6Var.c() : iw6Var.d(), z ? iw6Var.d() : iw6Var.c(), 1, 2)));
                    try {
                        bkd bkdVarC = ImageProcessingUtil.c(iw6Var, sbcVar2, ByteBuffer.allocateDirect(iw6Var.d() * iw6Var.c() * 4), i2);
                        iw6Var.close();
                        if (bkdVarC == null) {
                            throw new jv6(0, "Can't covert YUV to RGB", null);
                        }
                        bitmapCreateBitmap = i7h.p(bkdVarC);
                        bkdVarC.close();
                        sbcVar = sbcVar2;
                    } catch (UnsupportedOperationException e) {
                        unsupportedOperationException = e;
                        throw new jv6(0, "Can't convert " + (i == 35 ? "YUV" : "JPEG") + " to bitmap", unsupportedOperationException);
                    } catch (Throwable th2) {
                        th = th2;
                        sbcVar = sbcVar2;
                        if (sbcVar == null) {
                            throw th;
                        }
                        sbcVar.close();
                        throw th;
                    }
                } else {
                    if (i != 256 && i != 4101) {
                        throw new IllegalArgumentException("Invalid postview image format : " + i);
                    }
                    iw6 iw6Var2 = (iw6) obj2;
                    Bitmap bitmapP = i7h.p(iw6Var2);
                    iw6Var2.close();
                    Matrix matrix = new Matrix();
                    matrix.postRotate(i2);
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapP, 0, 0, bitmapP.getWidth(), bitmapP.getHeight(), matrix, true);
                }
                if (sbcVar != null) {
                    sbcVar.close();
                }
                return bitmapCreateBitmap;
            } catch (UnsupportedOperationException e2) {
                unsupportedOperationException = e2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // defpackage.czc
    public Object e() {
        return new RatingConditionRecord(0L, 0, 0, 0, (Map) null, 31, (rp3) null);
    }

    @Override // defpackage.h1b
    public Object get() {
        switch (this.a) {
            case 2:
                ji2 ji2VarE = ji2.e();
                nk8.o(ji2VarE);
                return ji2VarE;
            default:
                return grf.a;
        }
    }

    @Override // defpackage.n95
    public void j() {
        switch (this.a) {
            case 1:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    @Override // defpackage.n95
    public k1f n(int i, int i2) {
        switch (this.a) {
            case 1:
                throw new UnsupportedOperationException();
            default:
                return new l94();
        }
    }

    @Override // defpackage.n95
    public void q(xsc xscVar) {
        switch (this.a) {
            case 1:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 25:
                int iHashCode = hashCode();
                tq.o(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return tec.m("CreationExtras.Key@", string, "<", job.a.b(pwf.class).r(), ">");
            case 28:
                return "NO_SOURCE";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.czc
    public Object v0(Object obj, abf abfVar, ke5 ke5Var) {
        js3 js3Var = ga4.a;
        Object objP0 = ynb.p0(hr3.c, new fdb(abfVar, (RatingConditionRecord) obj, null), ke5Var);
        return objP0 == bw2.a ? objP0 : wef.a;
    }

    public /* synthetic */ yx4(int i) {
        this.a = i;
    }

    private final void g() {
    }

    private final void l(xsc xscVar) {
    }

    @Override // defpackage.ahc
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // defpackage.ahc
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
