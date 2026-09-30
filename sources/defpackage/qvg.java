package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qvg implements xch, kn9, an9, wm9 {
    public final /* synthetic */ int a;
    public final Executor b;
    public final yn2 c;
    public final gfh d;

    public /* synthetic */ qvg(Executor executor, yn2 yn2Var, gfh gfhVar, int i) {
        this.a = i;
        this.b = executor;
        this.c = yn2Var;
        this.d = gfhVar;
    }

    @Override // defpackage.kn9
    public void a(Object obj) {
        this.d.p(obj);
    }

    @Override // defpackage.xch
    public final void b(Task task) {
        switch (this.a) {
            case 0:
                this.b.execute(new w36(this, task, false, 21));
                break;
            default:
                this.b.execute(new lwg(this, task, false, 23));
                break;
        }
    }

    @Override // defpackage.wm9
    public void c() {
        this.d.s();
    }

    @Override // defpackage.an9
    public void r(Exception exc) {
        this.d.r(exc);
    }
}
