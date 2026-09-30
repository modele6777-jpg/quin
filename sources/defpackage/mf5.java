package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mf5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nf5 b;

    public /* synthetic */ mf5(nf5 nf5Var, int i) {
        this.a = i;
        this.b = nf5Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        vp0 vp0VarD1;
        vp0 vp0VarG;
        int i = this.a;
        nf5 nf5Var = this.b;
        switch (i) {
            case 0:
                nf5Var.a();
                return;
            case 1:
                nf5Var.a();
                return;
            default:
                Object obj = nf5.l;
                synchronized (obj) {
                    try {
                        ff5 ff5Var = nf5Var.a;
                        ff5Var.a();
                        k47 k47VarR = k47.r(ff5Var.a);
                        try {
                            vp0VarD1 = nf5Var.c.d1();
                            if (k47VarR != null) {
                                k47VarR.I();
                            }
                        } catch (Throwable th) {
                            if (k47VarR != null) {
                                k47VarR.I();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    int i2 = vp0VarD1.b;
                    boolean z = false;
                    if (i2 == 5) {
                        vp0VarG = nf5Var.g(vp0VarD1);
                    } else if (i2 == 3) {
                        vp0VarG = nf5Var.g(vp0VarD1);
                    } else if (!nf5Var.d.a(vp0VarD1)) {
                        return;
                    } else {
                        vp0VarG = nf5Var.b(vp0VarD1);
                    }
                    synchronized (obj) {
                        try {
                            ff5 ff5Var2 = nf5Var.a;
                            ff5Var2.a();
                            k47 k47VarR2 = k47.r(ff5Var2.a);
                            try {
                                nf5Var.c.Z0(vp0VarG);
                                if (k47VarR2 != null) {
                                    k47VarR2.I();
                                }
                            } catch (Throwable th3) {
                                if (k47VarR2 != null) {
                                    k47VarR2.I();
                                }
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    synchronized (nf5Var) {
                        try {
                            boolean z2 = vp0VarG.b == 4;
                            String str = vp0VarG.a;
                            if (z2 && !TextUtils.isEmpty(str)) {
                                z = TextUtils.equals(vp0VarD1.a, str) ? !(vp0VarD1.b == 4) : true;
                            }
                            if (z) {
                                Iterator it = nf5Var.j.iterator();
                                while (it.hasNext()) {
                                    FirebaseMessaging firebaseMessaging = ((sf5) it.next()).a;
                                    if (firebaseMessaging.d() != null) {
                                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                                            Log.d("FirebaseMessaging", "FID Change detected! Triggering re-sync");
                                        }
                                        synchronized (firebaseMessaging) {
                                            try {
                                                if (!firebaseMessaging.k) {
                                                    firebaseMessaging.g(0L);
                                                }
                                            } catch (Throwable th5) {
                                                throw th5;
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                    if (vp0VarG.b == 4) {
                        String str2 = vp0VarG.a;
                        synchronized (nf5Var) {
                            nf5Var.i = str2;
                        }
                    }
                    int i3 = vp0VarG.b;
                    if (i3 == 5) {
                        nf5Var.h(new qf5());
                        return;
                    } else if (i3 == 2 || i3 == 1) {
                        nf5Var.h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        nf5Var.i(vp0VarG);
                        return;
                    }
                } catch (qf5 e) {
                    nf5Var.h(e);
                    return;
                }
        }
    }
}
