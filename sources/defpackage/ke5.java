package defpackage;

import io.sentry.config.a;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ke5 extends gbe implements a26 {
    final /* synthetic */ Object $value;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ le5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke5(le5 le5Var, Object obj, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = le5Var;
        this.$value = obj;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new ke5(this.this$0, this.$value, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Exception {
        FileOutputStream fileOutputStreamE;
        Closeable closeable;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            try {
                File file = this.this$0.a;
                fileOutputStreamE = a.e(new FileOutputStream(file), file);
                le5 le5Var = this.this$0;
                Object obj2 = this.$value;
                try {
                    czc czcVar = le5Var.b;
                    abf abfVar = new abf(fileOutputStreamE);
                    this.L$0 = fileOutputStreamE;
                    this.L$1 = fileOutputStreamE;
                    this.label = 1;
                    Object objV0 = czcVar.v0(obj2, abfVar, this);
                    bw2 bw2Var = bw2.a;
                    if (objV0 == bw2Var) {
                        return bw2Var;
                    }
                    closeable = fileOutputStreamE;
                } catch (Throwable th) {
                    th = th;
                    closeable = fileOutputStreamE;
                    throw th;
                }
            } catch (Exception e) {
                if (e instanceof FileNotFoundException) {
                    throw n16.b0(this.this$0.a.getParent(), (FileNotFoundException) e);
                }
                throw e;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fileOutputStreamE = (FileOutputStream) this.L$1;
            closeable = (Closeable) this.L$0;
            try {
                jzb.q(obj);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    ym8.t(closeable, th);
                    throw th3;
                }
            }
        }
        fileOutputStreamE.getFD().sync();
        ym8.t(closeable, null);
        return wef.a;
    }
}
