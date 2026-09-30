package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import defpackage.ib8;
import defpackage.ks0;
import defpackage.xag;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.replay.capture.v;
import io.sentry.g1;
import io.sentry.h7;
import io.sentry.l0;
import io.sentry.m7;
import io.sentry.n7;
import io.sentry.protocol.h0;
import io.sentry.q1;
import io.sentry.q5;
import io.sentry.y6;
import io.sentry.z0;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements GestureDetector.OnGestureListener {
    public final WeakReference a;
    public final g1 b;
    public final SentryAndroidOptions c;
    public io.sentry.internal.gestures.c d = null;
    public q1 e = null;
    public e f;
    public final f g;

    public g(Activity activity, g1 g1Var, SentryAndroidOptions sentryAndroidOptions) {
        e eVar = e.Unknown;
        this.f = eVar;
        f fVar = new f();
        fVar.a = eVar;
        fVar.c = 0.0f;
        fVar.d = 0.0f;
        this.g = fVar;
        this.a = new WeakReference(activity);
        this.b = g1Var;
        this.c = sentryAndroidOptions;
    }

    public final void a(io.sentry.internal.gestures.c cVar, e eVar, Map map, MotionEvent motionEvent) {
        String str;
        if (this.c.isEnableUserInteractionBreadcrumbs()) {
            int i = d.a[eVar.ordinal()];
            if (i == 1) {
                str = "click";
            } else if (i != 2) {
                str = i != 3 ? "unknown" : "swipe";
            } else {
                str = "scroll";
            }
            l0 l0Var = new l0();
            l0Var.d(motionEvent, "android:motionEvent");
            l0Var.d(cVar.a.get(), "android:view");
            String str2 = cVar.c;
            String str3 = cVar.b;
            String str4 = cVar.d;
            io.sentry.g gVar = new io.sentry.g();
            gVar.e = "user";
            gVar.g = "ui.".concat(str);
            if (str2 != null) {
                gVar.d(str2, "view.id");
            }
            if (str3 != null) {
                gVar.d(str3, "view.class");
            }
            if (str4 != null) {
                gVar.d(str4, "view.tag");
            }
            for (Map.Entry entry : map.entrySet()) {
                gVar.d(entry.getValue(), (String) entry.getKey());
            }
            gVar.w = q5.INFO;
            this.b.i(gVar, l0Var);
        }
    }

    public final View b(String str) {
        Activity activity = (Activity) this.a.get();
        SentryAndroidOptions sentryAndroidOptions = this.c;
        if (activity == null) {
            sentryAndroidOptions.getLogger().i(q5.DEBUG, ib8.j("Activity is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            sentryAndroidOptions.getLogger().i(q5.DEBUG, ib8.j("Window is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView != null) {
            return viewPeekDecorView;
        }
        sentryAndroidOptions.getLogger().i(q5.DEBUG, ib8.j("DecorView is null in ", str, ". No breadcrumb captured."), new Object[0]);
        return null;
    }

    public final void c(io.sentry.internal.gestures.c cVar, e eVar) {
        String str;
        boolean z = eVar == e.Click || !(eVar == this.f && cVar.equals(this.d));
        SentryAndroidOptions sentryAndroidOptions = this.c;
        boolean zIsTracingEnabled = sentryAndroidOptions.isTracingEnabled();
        int i = 4;
        g1 g1Var = this.b;
        if (!zIsTracingEnabled || !sentryAndroidOptions.isEnableUserInteractionTracing()) {
            if (z) {
                if (sentryAndroidOptions.isEnableAutoTraceIdGeneration()) {
                    g1Var.n(new v(i));
                }
                this.d = cVar;
                this.f = eVar;
                return;
            }
            return;
        }
        Activity activity = (Activity) this.a.get();
        if (activity == null) {
            sentryAndroidOptions.getLogger().i(q5.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
            return;
        }
        String str2 = cVar.c;
        if (str2 == null) {
            str2 = cVar.d;
            io.sentry.util.b.r(str2, "UiElement.tag can't be null");
        }
        q1 q1Var = this.e;
        if (q1Var != null) {
            if (!z && !q1Var.e()) {
                sentryAndroidOptions.getLogger().i(q5.DEBUG, ib8.j("The view with id: ", str2, " already has an ongoing transaction assigned. Rescheduling finish"), new Object[0]);
                if (sentryAndroidOptions.getIdleTimeout() != null) {
                    this.e.s();
                    return;
                }
                return;
            }
            d(h7.OK);
        }
        q1[] q1VarArr = {null};
        g1Var.n(new xag(11, q1VarArr));
        if (q1VarArr[0] != null) {
            sentryAndroidOptions.getLogger().i(q5.DEBUG, "Transaction won't be created for view with id: %s since there's already a transaction bound to the Scope.", str2);
            return;
        }
        String strL = ks0.l(new StringBuilder(activity.getClass().getSimpleName()), ".", str2);
        int i2 = d.a[eVar.ordinal()];
        if (i2 == 1) {
            str = "click";
        } else if (i2 != 2) {
            str = i2 != 3 ? "unknown" : "swipe";
        } else {
            str = "scroll";
        }
        String strConcat = "ui.action.".concat(str);
        n7 n7Var = new n7();
        n7Var.f = true;
        long deadlineTimeout = sentryAndroidOptions.getDeadlineTimeout();
        n7Var.v = deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout);
        n7Var.g = sentryAndroidOptions.getIdleTimeout();
        n7Var.a = true;
        n7Var.d = "auto.ui.gesture_listener.".concat(cVar.e);
        q1 q1VarM = g1Var.m(new m7(strL, h0.COMPONENT, strConcat, null), n7Var);
        g1Var.n(new y6(i, this, q1VarM));
        this.e = q1VarM;
        this.d = cVar;
        this.f = eVar;
    }

    public final void d(h7 h7Var) {
        q1 q1Var = this.e;
        if (q1Var != null) {
            h7 h7VarA = q1Var.a();
            q1 q1Var2 = this.e;
            if (h7VarA == null) {
                q1Var2.h(h7Var);
            } else {
                q1Var2.j();
            }
        }
        this.b.n(new xag(10, this));
        this.e = null;
        if (this.d != null) {
            this.d = null;
        }
        this.f = e.Unknown;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        f fVar = this.g;
        fVar.b = null;
        fVar.a = e.Unknown;
        fVar.c = 0.0f;
        fVar.d = 0.0f;
        fVar.c = motionEvent.getX();
        fVar.d = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.g.a = e.Swipe;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        View viewB = b("onScroll");
        if (viewB != null && motionEvent != null) {
            f fVar = this.g;
            if (fVar.a == e.Unknown) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                io.sentry.internal.gestures.b bVar = io.sentry.internal.gestures.b.SCROLLABLE;
                SentryAndroidOptions sentryAndroidOptions = this.c;
                io.sentry.internal.gestures.c cVarH = io.sentry.config.a.h(sentryAndroidOptions, viewB, x, y, bVar);
                if (cVarH == null) {
                    sentryAndroidOptions.getLogger().i(q5.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                    fVar.a = e.Scroll;
                    return false;
                }
                z0 logger = sentryAndroidOptions.getLogger();
                q5 q5Var = q5.DEBUG;
                String str = cVarH.c;
                if (str == null) {
                    str = cVarH.d;
                    io.sentry.util.b.r(str, "UiElement.tag can't be null");
                }
                logger.i(q5Var, "Scroll target found: ".concat(str), new Object[0]);
                fVar.b = cVarH;
                fVar.a = e.Scroll;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        View viewB = b("onSingleTapUp");
        if (viewB != null && motionEvent != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            io.sentry.internal.gestures.b bVar = io.sentry.internal.gestures.b.CLICKABLE;
            SentryAndroidOptions sentryAndroidOptions = this.c;
            io.sentry.internal.gestures.c cVarH = io.sentry.config.a.h(sentryAndroidOptions, viewB, x, y, bVar);
            if (cVarH == null) {
                sentryAndroidOptions.getLogger().i(q5.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            e eVar = e.Click;
            a(cVarH, eVar, Collections.EMPTY_MAP, motionEvent);
            c(cVarH, eVar);
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
