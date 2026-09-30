package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fcd extends gu7 implements x16 {
    final /* synthetic */ hcd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcd(hcd hcdVar) {
        super(0);
        this.this$0 = hcdVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        Object obj;
        hcd hcdVar = this.this$0;
        if (!hcdVar.g && hcdVar.b.e() && this.this$0.f.f()) {
            List listC = this.this$0.c();
            int size = listC.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    obj = null;
                    break;
                }
                obj = listC.get(i);
                if (((icd) obj).i()) {
                    break;
                }
                i++;
            }
            icd icdVar = (icd) obj;
            if (icdVar != null) {
                hcd hcdVar2 = this.this$0;
                ze5 ze5Var = icdVar.e().f;
                if (ze5Var instanceof fxd) {
                    fxd fxdVar = (fxd) ze5Var;
                    ynb.V(hcdVar2.b.b, null, null, new ecd(hcdVar2, new fxd(fxdVar.a, fxdVar.b, new hl9((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L))), null), 3);
                }
                hcdVar2.g = true;
            }
        }
        hl9 hl9Var = (hl9) this.this$0.f.e();
        long j = hl9Var.a;
        return hl9Var;
    }
}
