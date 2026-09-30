package io.sentry.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import defpackage.ggg;
import defpackage.o3d;
import defpackage.q5f;
import defpackage.s5f;
import defpackage.yea;
import io.sentry.q5;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h2 extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final /* synthetic */ Object f;

    public h2(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, io.sentry.g1 g1Var, SentryAndroidOptions sentryAndroidOptions) {
        this.a = 0;
        this.f = systemEventsBreadcrumbsIntegration;
        this.d = new ggg(60000L, 0);
        this.e = new char[64];
        this.b = g1Var;
        this.c = sentryAndroidOptions;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        g2 g2Var;
        Bundle extras;
        int i;
        switch (this.a) {
            case 0:
                SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = (SystemEventsBreadcrumbsIntegration) this.f;
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.c;
                String action = intent.getAction();
                String str = null;
                if (!"android.intent.action.BATTERY_CHANGED".equals(action)) {
                    g2Var = null;
                } else if (!((ggg) this.d).b()) {
                    Float fB = u0.b(intent, sentryAndroidOptions);
                    g2Var = new g2(fB != null ? Integer.valueOf(fB.intValue()) : null, u0.d(intent, sentryAndroidOptions));
                    if (!g2Var.equals(systemEventsBreadcrumbsIntegration.z)) {
                        systemEventsBreadcrumbsIntegration.z = g2Var;
                    }
                }
                io.sentry.g gVar = new io.sentry.g(System.currentTimeMillis());
                gVar.e = "system";
                gVar.g = "device.event";
                char[] cArr = (char[]) this.e;
                if (action != null) {
                    int length = action.length();
                    int length2 = cArr.length;
                    int i2 = length - 1;
                    while (true) {
                        if (i2 >= 0) {
                            char cCharAt = action.charAt(i2);
                            if (cCharAt == '.') {
                                str = new String(cArr, length2, cArr.length - length2);
                            } else if (length2 == 0) {
                                Charset charset = io.sentry.util.p.a;
                                int iLastIndexOf = action.lastIndexOf(".");
                                if (iLastIndexOf >= 0 && action.length() > (i = iLastIndexOf + 1)) {
                                    str = action.substring(i);
                                }
                            } else {
                                length2--;
                                cArr[length2] = cCharAt;
                                i2--;
                            }
                        }
                        str = action;
                    }
                }
                if (str != null) {
                    gVar.d(str, "action");
                }
                if (g2Var != null) {
                    Integer num = g2Var.a;
                    if (num != null) {
                        gVar.d(num, "level");
                    }
                    Boolean bool = g2Var.b;
                    if (bool != null) {
                        gVar.d(bool, "charging");
                    }
                } else if (sentryAndroidOptions.isEnableSystemEventBreadcrumbsExtras() && (extras = intent.getExtras()) != null && !extras.isEmpty()) {
                    HashMap map = new HashMap(extras.size());
                    for (String str2 : extras.keySet()) {
                        try {
                            Object obj = extras.get(str2);
                            if (obj != null) {
                                map.put(str2, obj.toString());
                            }
                        } catch (Throwable th) {
                            sentryAndroidOptions.getLogger().c(q5.ERROR, th, "%s key of the %s action threw an error.", str2, action);
                        }
                    }
                    gVar.d(map, "extras");
                }
                gVar.w = q5.INFO;
                io.sentry.l0 l0Var = new io.sentry.l0();
                l0Var.d(intent, "android:intent");
                ((io.sentry.g1) this.b).i(gVar, l0Var);
                break;
            default:
                if (((AtomicBoolean) this.b).compareAndSet(false, true)) {
                    try {
                        ((Context) this.c).unregisterReceiver(this);
                    } catch (IllegalArgumentException e) {
                        b1.n("DirectBootUtils", "Failed to unregister receiver", e);
                    }
                    o3d o3dVar = (o3d) this.d;
                    yea yeaVar = (yea) this.e;
                    Executor executor = (Executor) this.f;
                    s5f s5fVar = new s5f();
                    s5fVar.w = new q5f(s5fVar, yeaVar);
                    executor.execute(s5fVar);
                    o3dVar.o(s5fVar);
                }
                break;
        }
    }

    public h2(AtomicBoolean atomicBoolean, Context context, o3d o3dVar, yea yeaVar, Executor executor) {
        this.a = 1;
        this.b = atomicBoolean;
        this.c = context;
        this.d = o3dVar;
        this.e = yeaVar;
        this.f = executor;
    }
}
