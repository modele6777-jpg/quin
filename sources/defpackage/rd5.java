package defpackage;

import io.sentry.config.a;
import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rd5 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ File b;

    public /* synthetic */ rd5(File file, int i) {
        this.a = i;
        this.b = file;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        File file = this.b;
        switch (i) {
            case 0:
                synchronized (sd5.e) {
                    sd5.d.remove(file.getAbsolutePath());
                }
                return wef.a;
            default:
                return a.b(file, new FileInputStream(file));
        }
    }
}
