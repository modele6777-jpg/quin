package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wo3 extends gbe implements l26 {
    final /* synthetic */ lga $error;
    final /* synthetic */ long $resumePositionMs;
    final /* synthetic */ boolean $shouldResume;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ bp3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo3(bp3 bp3Var, lga lgaVar, String str, long j, boolean z, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = bp3Var;
        this.$error = lgaVar;
        this.$url = str;
        this.$resumePositionMs = j;
        this.$shouldResume = z;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new wo3(this.this$0, this.$error, this.$url, this.$resumePositionMs, this.$shouldResume, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            js3 js3Var = ga4.a;
            hr3 hr3Var = hr3.c;
            vo3 vo3Var = new vo3(this.$url, null);
            this.label = 1;
            obj = ynb.p0(hr3Var, vo3Var, this);
            bw2 bw2Var = bw2.a;
            if (obj == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        Object objB = ((ezb) obj).b();
        boolean z = objB instanceof dzb;
        wef wefVar = wef.a;
        if (z) {
            Throwable thA = ezb.a(objB);
            if (thA != null) {
                bp3 bp3Var = this.this$0;
                String str = this.$url;
                bp3Var.d().h("Failed to reset TTS cache after HTTP 416 for " + str, thA);
            }
            bp3 bp3Var2 = this.this$0;
            lga lgaVar = this.$error;
            int i2 = bp3.Y;
            bp3Var2.h(lgaVar);
            return wefVar;
        }
        bp3 bp3Var3 = this.this$0;
        y45 y45Var = bp3Var3.b;
        if (y45Var != null && pa7.t(bp3Var3.f, this.$url)) {
            this.this$0.w = new Long(this.$resumePositionMs);
            bp3 bp3Var4 = this.this$0;
            String str2 = this.$url;
            bp3Var4.getClass();
            oxa oxaVarA = bp3.a(str2);
            y45Var.Z();
            List listSingletonList = Collections.singletonList(oxaVarA);
            y45Var.Z();
            y45Var.N(listSingletonList);
            y45Var.P(this.$shouldResume);
            y45Var.D();
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((wo3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
