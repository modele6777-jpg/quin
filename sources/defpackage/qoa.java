package defpackage;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qoa extends gbe implements l26 {
    final /* synthetic */ byte[] $audioData;
    final /* synthetic */ String $uploadUrl;
    int label;
    final /* synthetic */ soa this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qoa(soa soaVar, String str, byte[] bArr, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = soaVar;
        this.$uploadUrl = str;
        this.$audioData = bArr;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new qoa(this.this$0, this.$uploadUrl, this.$audioData, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        boolean z;
        String strU;
        String strM0 = null;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        soa soaVar = this.this$0;
        String str = this.$uploadUrl;
        byte[] bArr = this.$audioData;
        int i = soa.H0;
        soaVar.getClass();
        int i2 = ftb.a;
        rob robVar = oq8.e;
        oq8 oq8VarC0 = kj0.c0("audio/wav");
        int length = bArr.length;
        ieg.a(bArr.length, 0L, length);
        etb etbVar = new etb(oq8VarC0, length, bArr);
        zsb zsbVar = new zsb();
        zsbVar.c(str);
        zsbVar.b("PUT", etbVar);
        zsbVar.c.a("Content-Type", "audio/wav");
        try {
            ryb rybVarExecute = FirebasePerfOkHttpClient.execute(new cib(soaVar.e, new btb(zsbVar)));
            try {
                if (!rybVarExecute.F0) {
                    m8b m8bVarD = soaVar.d();
                    int i3 = rybVarExecute.d;
                    vyb vybVar = rybVarExecute.g;
                    if (vybVar != null && (strU = vybVar.u()) != null) {
                        strM0 = v4e.m0(200, strU);
                    }
                    m8bVarD.b("S3 upload failed: HTTP " + i3 + ", body=" + strM0);
                }
                z = rybVarExecute.F0;
                rybVarExecute.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ym8.t(rybVarExecute, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            ynb.h0(e);
            soaVar.d().c("S3 upload exception", e);
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((qoa) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
