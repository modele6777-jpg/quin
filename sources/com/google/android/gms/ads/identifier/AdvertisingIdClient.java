package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import defpackage.ayg;
import defpackage.bc6;
import defpackage.gtg;
import defpackage.gxg;
import defpackage.jk2;
import defpackage.o01;
import defpackage.oa7;
import defpackage.rc6;
import defpackage.vrg;
import defpackage.yvg;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class AdvertisingIdClient {
    public o01 a;
    public ayg b;
    public boolean c;
    public final Object d = new Object();
    public vrg e;
    public final Context f;
    public final long g;

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static final class Info {
        public final String a;
        public final boolean b;

        public Info(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public String getId() {
            return this.a;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.b;
        }

        public final String toString() {
            String str = this.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(this.b);
            return sb.toString();
        }
    }

    public AdvertisingIdClient(Context context) {
        oa7.A(context);
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext != null ? applicationContext : context;
        this.c = false;
        this.g = -1L;
    }

    public static void c(Info info, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (info != null) {
                map.put("limit_ad_tracking", true != info.isLimitAdTrackingEnabled() ? "0" : "1");
                String id = info.getId();
                if (id != null) {
                    map.put("ad_id_size", Integer.toString(id.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j));
            new a(map).start();
        }
    }

    public static Info getAdvertisingIdInfo(Context context) {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.b();
            Info infoD = advertisingIdClient.d();
            c(infoD, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            advertisingIdClient.a();
            return infoD;
        } catch (Throwable th) {
            try {
                c(null, -1L, th);
                throw th;
            } catch (Throwable th2) {
                advertisingIdClient.a();
                throw th2;
            }
        }
    }

    public final void a() {
        oa7.z("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f == null || this.a == null) {
                    return;
                }
                try {
                    if (this.c) {
                        jk2.b().c(this.f, this.a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.c = false;
                this.b = null;
                this.a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        oa7.z("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.c) {
                    a();
                }
                Context context = this.f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iB = bc6.b.b(context, 12451000);
                    if (iB != 0 && iB != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    o01 o01Var = new o01();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!jk2.b().a(context, intent, o01Var, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.a = o01Var;
                        try {
                            IBinder iBinderA = o01Var.a();
                            int i = gxg.d;
                            IInterface iInterfaceQueryLocalInterface = iBinderA.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.b = iInterfaceQueryLocalInterface instanceof ayg ? (ayg) iInterfaceQueryLocalInterface : new yvg(iBinderA);
                            this.c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } catch (Throwable th2) {
                        throw new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new rc6();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final Info d() {
        Info info;
        oa7.z("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.c) {
                    synchronized (this.d) {
                        vrg vrgVar = this.e;
                        if (vrgVar == null || !vrgVar.d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        b();
                        if (!this.c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                oa7.A(this.a);
                oa7.A(this.b);
                try {
                    yvg yvgVar = (yvg) this.b;
                    yvgVar.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    boolean z = true;
                    Parcel parcelD = yvgVar.d(parcelObtain, 1);
                    String string = parcelD.readString();
                    parcelD.recycle();
                    yvg yvgVar2 = (yvg) this.b;
                    yvgVar2.getClass();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i = gtg.a;
                    parcelObtain2.writeInt(1);
                    Parcel parcelD2 = yvgVar2.d(parcelObtain2, 2);
                    if (parcelD2.readInt() == 0) {
                        z = false;
                    }
                    parcelD2.recycle();
                    info = new Info(string, z);
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.d) {
            vrg vrgVar2 = this.e;
            if (vrgVar2 != null) {
                vrgVar2.c.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.g;
            if (j > 0) {
                this.e = new vrg(this, j);
            }
        }
        return info;
    }

    public final void finalize() throws Throwable {
        a();
        super.finalize();
    }
}
