package defpackage;

import io.sentry.instrumentation.file.a;
import io.sentry.instrumentation.file.e;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j45 implements c98, a {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j45(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // io.sentry.instrumentation.file.a
    public Object call() throws IOException {
        e eVar = (e) this.c;
        eVar.a.write(this.b);
        return 1;
    }

    @Override // defpackage.c98
    public void d(Object obj) {
        switch (this.a) {
            case 0:
                gye gyeVar = ((mga) this.c).a;
                ((xga) obj).u(this.b);
                break;
            default:
                ((xga) obj).D((op8) this.c, this.b);
                break;
        }
    }
}
