package io.sentry;

import defpackage.yd5;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m4 {
    public final /* synthetic */ z0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ z c;
    public final /* synthetic */ File d;

    public /* synthetic */ m4(z0 z0Var, String str, z zVar, File file) {
        this.a = z0Var;
        this.b = str;
        this.c = zVar;
        this.d = file;
    }

    public final void a() {
        File file = this.d;
        q5 q5Var = q5.DEBUG;
        String str = this.b;
        z0 z0Var = this.a;
        z0Var.i(q5Var, "Started processing cached files from %s", str);
        z zVar = this.c;
        j7 j7Var = zVar.d;
        z0 z0Var2 = zVar.b;
        try {
            z0Var2.i(q5Var, "Processing dir. %s", file.getAbsolutePath());
            File[] fileArrListFiles = file.listFiles(new yd5(1, zVar));
            if (fileArrListFiles == null) {
                z0Var2.i(q5.ERROR, "Cache dir %s is null or is not a directory.", file.getAbsolutePath());
            } else {
                z0Var2.i(q5Var, "Processing %d items from cache dir %s", Integer.valueOf(fileArrListFiles.length), file.getAbsolutePath());
                for (File file2 : fileArrListFiles) {
                    if (file2.isFile()) {
                        String absolutePath = file2.getAbsolutePath();
                        if (!j7Var.contains(absolutePath)) {
                            io.sentry.android.core.internal.tombstone.b bVarF = zVar.a.f();
                            if (bVarF != null && bVarF.h(p.All)) {
                                z0Var2.i(q5.INFO, "DirectoryProcessor, rate limiting active.", new Object[0]);
                                break;
                            } else {
                                z0Var2.i(q5.DEBUG, "Processing file: %s", absolutePath);
                                zVar.b(file2, io.sentry.util.b.f(new y(zVar.c, zVar.b, absolutePath, j7Var)));
                                Thread.sleep(100L);
                            }
                        } else {
                            z0Var2.i(q5.DEBUG, "File '%s' has already been processed so it will not be processed again.", absolutePath);
                        }
                    } else {
                        z0Var2.i(q5.DEBUG, "File %s is not a File.", file2.getAbsolutePath());
                    }
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            z0Var2.c(q5.INFO, e, "Thread interrupted during processing '%s'", file.getAbsolutePath());
        } catch (Throwable th) {
            z0Var2.c(q5.ERROR, th, "Failed processing '%s'", file.getAbsolutePath());
        }
        z0Var.i(q5.DEBUG, "Finished processing cached files from %s", str);
    }
}
