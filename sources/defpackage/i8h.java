package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i8h implements u8e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ i8h(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.u8e
    public final Object get() {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                Object obj = f8h.j;
                final hbc hbcVar = new hbc();
                hbcVar.a = context;
                context.getClass();
                if (((u8e) hbcVar.b) == null) {
                    hbcVar.b = f8h.m;
                }
                final int i2 = 1;
                if (((u8e) hbcVar.c) == null) {
                    hbcVar.c = vtb.r(new i8h((Context) hbcVar.a, i2));
                }
                if (((b8h) hbcVar.d) == null) {
                    hbcVar.d = new u8e() { // from class: b8h
                        @Override // defpackage.u8e
                        public final Object get() {
                            int i3 = i2;
                            hbc hbcVar2 = hbcVar;
                            switch (i3) {
                                case 0:
                                    Context context2 = (Context) hbcVar2.a;
                                    Object obj2 = f8h.j;
                                    try {
                                        ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                                        applicationInfo.getClass();
                                        return new gta(applicationInfo);
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        return v.a;
                                    }
                                default:
                                    return new gta(new cdh((u8e) hbcVar2.b));
                            }
                        }
                    };
                }
                final int i3 = 0;
                if (((u8e) hbcVar.e) == null) {
                    Context context2 = (Context) hbcVar.a;
                    ArrayList arrayList = new ArrayList();
                    zdh zdhVar = new zdh(new dz0(context2, 2));
                    new ConcurrentHashMap();
                    Collections.addAll(arrayList, zdhVar, new deh());
                    hbcVar.e = vtb.r(new k8h(i3, arrayList));
                }
                if (((b8h) hbcVar.f) == null) {
                    hbcVar.f = new u8e() { // from class: b8h
                        @Override // defpackage.u8e
                        public final Object get() {
                            int i4 = i3;
                            hbc hbcVar2 = hbcVar;
                            switch (i4) {
                                case 0:
                                    Context context3 = (Context) hbcVar2.a;
                                    Object obj2 = f8h.j;
                                    try {
                                        ApplicationInfo applicationInfo = context3.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                                        applicationInfo.getClass();
                                        return new gta(applicationInfo);
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        return v.a;
                                    }
                                default:
                                    return new gta(new cdh((u8e) hbcVar2.b));
                            }
                        }
                    };
                }
                return new f8h((Context) hbcVar.a, (u8e) hbcVar.b, (u8e) hbcVar.c, (b8h) hbcVar.d, (u8e) hbcVar.e, (b8h) hbcVar.f);
            case 1:
                Object obj2 = f8h.j;
                return new s9h(new w6h(context, h6h.a, k60.h, yb6.c));
            default:
                Object obj3 = v8h.a;
                return y7h.Z(context);
        }
    }
}
