package defpackage;

import android.graphics.Bitmap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r7b implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ cv6 c;
    public final /* synthetic */ h0e d;
    public final /* synthetic */ h0e e;

    public /* synthetic */ r7b(boolean z, cv6 cv6Var, h0e h0eVar, h0e h0eVar2, int i) {
        this.a = i;
        this.b = z;
        this.c = cv6Var;
        this.d = h0eVar;
        this.e = h0eVar2;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        switch (this.a) {
            case 0:
                h81 h81Var = (h81) obj;
                h81Var.getClass();
                return h81Var.b(new r7b(this.b, this.c, this.d, this.e, 1));
            default:
                im2 im2Var = (im2) obj;
                im2Var.getClass();
                vv7 vv7Var = (vv7) im2Var;
                xl1 xl1Var = vv7Var.a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (xl1Var.f() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (xl1Var.f() & 4294967295L));
                vv7Var.a();
                boolean z = this.b;
                y72 y72Var = new y72(abg.d(z ? 4286084010L : 4292071666L));
                long j = y72.j;
                List listI = t72.I(y72Var, new y72(j));
                h0e h0eVar = this.d;
                float f = fIntBitsToFloat2 * 0.1f;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((((Number) h0eVar.getValue()).floatValue() + 0.8f) * fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
                float fC = ald.c(xl1Var.f());
                h0e h0eVar2 = this.e;
                sn4.I(im2Var, gec.L(listI, jFloatToRawIntBits, ((Number) h0eVar2.getValue()).floatValue() * fC), ((Number) h0eVar2.getValue()).floatValue() * ald.c(xl1Var.f()), (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits((((Number) h0eVar.getValue()).floatValue() + 0.8f) * fIntBitsToFloat)) << 32), 112);
                float f2 = 0.4f * fIntBitsToFloat2;
                sn4.I(im2Var, gec.L(t72.I(new y72(abg.d(z ? 4281678206L : 4287796694L)), new y72(j)), (((long) Float.floatToRawIntBits((((Number) h0eVar.getValue()).floatValue() + 0.3f) * fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), ((Number) h0eVar2.getValue()).floatValue() * ald.c(xl1Var.f())), ald.c(xl1Var.f()) * ((Number) h0eVar2.getValue()).floatValue(), (((long) Float.floatToRawIntBits((((Number) h0eVar.getValue()).floatValue() + 0.3f) * fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), 112);
                float f3 = 0.6f * fIntBitsToFloat2;
                sn4.I(im2Var, gec.L(t72.I(new y72(abg.d(z ? 4284098873L : 4293964776L)), new y72(j)), (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (((long) Float.floatToRawIntBits((((Number) h0eVar.getValue()).floatValue() + 0.8f) * fIntBitsToFloat)) << 32), ((Number) h0eVar2.getValue()).floatValue() * ald.c(xl1Var.f())), ((Number) h0eVar2.getValue()).floatValue() * ald.c(xl1Var.f()), (((long) Float.floatToRawIntBits((((Number) h0eVar.getValue()).floatValue() + 0.8f) * fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), 112);
                float f4 = 0.8f * fIntBitsToFloat2;
                sn4.I(im2Var, gec.L(t72.I(new y72(abg.d(z ? 4281944678L : 4289711355L)), new y72(j)), (((long) Float.floatToRawIntBits((((Number) h0eVar.getValue()).floatValue() + 0.1f) * fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), ((Number) h0eVar2.getValue()).floatValue() * ald.c(xl1Var.f())), ((Number) h0eVar2.getValue()).floatValue() * ald.c(xl1Var.f()), (((long) Float.floatToRawIntBits((((Number) h0eVar.getValue()).floatValue() + 0.1f) * fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), 112);
                cv6 cv6Var = this.c;
                float width = ((ks) cv6Var).a.getWidth();
                Bitmap bitmap = ((ks) cv6Var).a;
                float height = width / ((float) bitmap.getHeight()) > fIntBitsToFloat / fIntBitsToFloat2 ? fIntBitsToFloat2 / bitmap.getHeight() : fIntBitsToFloat / bitmap.getWidth();
                float width2 = bitmap.getWidth() * height;
                float height2 = bitmap.getHeight() * height;
                sn4.g0(im2Var, cv6Var, 0L, 0L, (((long) ym8.L((fIntBitsToFloat2 - height2) / 2.0f)) & 4294967295L) | (((long) ym8.L((fIntBitsToFloat - width2) / 2.0f)) << 32), (((long) ym8.L(width2)) << 32) | (((long) ym8.L(height2)) & 4294967295L), 0.0f, null, 0, 742);
                return wef.a;
        }
    }
}
