package defpackage;

import android.media.AudioRecord;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ck0 extends gbe implements l26 {
    final /* synthetic */ AudioRecord $ar;
    final /* synthetic */ int $bufferSize;
    final /* synthetic */ File $file;
    int label;
    final /* synthetic */ gk0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck0(gk0 gk0Var, AudioRecord audioRecord, File file, int i, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = gk0Var;
        this.$ar = audioRecord;
        this.$file = file;
        this.$bufferSize = i;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ck0(this.this$0, this.$ar, this.$file, this.$bufferSize, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            gk0 gk0Var = this.this$0;
            AudioRecord audioRecord = this.$ar;
            File file = this.$file;
            int i2 = this.$bufferSize;
            this.label = 1;
            int i3 = gk0.z;
            Object objG = gk0Var.g(audioRecord, file, i2, this);
            bw2 bw2Var = bw2.a;
            if (objG == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ck0) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
