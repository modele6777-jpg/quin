package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class g94 implements Executor {
    public static volatile g94 b;
    public static final g94 c = new g94(1);
    public static final /* synthetic */ g94 d = new g94(3);
    public static final /* synthetic */ g94 e = new g94(4);
    public static final /* synthetic */ g94 f = new g94(5);
    public final /* synthetic */ int a;

    public /* synthetic */ g94(int i) {
        this.a = i;
    }

    public static g94 a() {
        if (b != null) {
            return b;
        }
        synchronized (g94.class) {
            try {
                if (b == null) {
                    b = new g94(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                new Thread(runnable).start();
                break;
            case 3:
                runnable.run();
                break;
            case 4:
                runnable.run();
                break;
            case 5:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
