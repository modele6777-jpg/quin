package defpackage;

import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class l18 {
    public final String a;
    public volatile Logger b;
    public final Object c;

    public l18(Class cls, int i) {
        switch (i) {
            case 1:
                this.c = new osg();
                this.a = cls.getName();
                break;
            default:
                this.c = new Object();
                this.a = cls.getName();
                break;
        }
    }

    public Logger a() {
        Logger logger = this.b;
        if (logger != null) {
            return logger;
        }
        synchronized (this.c) {
            try {
                Logger logger2 = this.b;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.a);
                this.b = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Logger b() {
        Logger logger = this.b;
        if (logger != null) {
            return logger;
        }
        synchronized (((osg) this.c)) {
            try {
                Logger logger2 = this.b;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.a);
                this.b = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
