package io.sentry.android.core;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import defpackage.bwe;
import defpackage.rw;
import io.sentry.q5;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class y1 implements SensorEventListener {
    public SensorManager a;
    public Sensor b;
    public HandlerThread c;
    public Handler d;
    public volatile w1 e;
    public io.sentry.z0 f;
    public boolean g;
    public final rw h;

    public y1(io.sentry.z0 z0Var) {
        rw rwVar = new rw();
        rwVar.c = new q0();
        this.h = rwVar;
        this.f = z0Var;
    }

    public final synchronized void a() {
        this.g = true;
        d();
        HandlerThread handlerThread = this.c;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.c = null;
            this.d = null;
        }
    }

    public final synchronized void b(Context context) {
        try {
            if (this.g) {
                return;
            }
            SensorManager sensorManager = this.a;
            if (sensorManager == null) {
                sensorManager = (SensorManager) context.getSystemService("sensor");
                this.a = sensorManager;
            }
            if (sensorManager != null && this.b == null) {
                this.b = sensorManager.getDefaultSensor(1, false);
            }
            if (this.b != null && this.c == null) {
                HandlerThread handlerThread = new HandlerThread("sentry-shake");
                this.c = handlerThread;
                handlerThread.start();
                this.d = new Handler(this.c.getLooper());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(Activity activity, w1 w1Var) {
        if (this.g) {
            return;
        }
        this.e = w1Var;
        b(activity);
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            this.f.i(q5.WARNING, "SensorManager is not available. Shake detection disabled.", new Object[0]);
            return;
        }
        Sensor sensor = this.b;
        if (sensor == null) {
            this.f.i(q5.WARNING, "Accelerometer sensor not available. Shake detection disabled.", new Object[0]);
        } else {
            sensorManager.registerListener(this, sensor, 3, this.d);
        }
    }

    public final synchronized void d() {
        try {
            this.e = null;
            SensorManager sensorManager = this.a;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this);
            }
            Handler handler = this.d;
            if (handler != null) {
                handler.post(new bwe(14, this));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        int i2;
        x1 x1Var;
        int i3;
        x1 x1Var2;
        int i4 = 1;
        if (sensorEvent.sensor.getType() != 1) {
            return;
        }
        float[] fArr = sensorEvent.values;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        boolean z = Math.sqrt((double) ((f3 * f3) + ((f2 * f2) + (f * f)))) > 13.0d;
        rw rwVar = this.h;
        long j = sensorEvent.timestamp;
        q0 q0Var = (q0) rwVar.c;
        long j2 = j - 500000000;
        while (true) {
            i = rwVar.a;
            if (i >= 4 && (x1Var2 = (x1) rwVar.d) != null) {
                i2 = i4;
                if (j2 - x1Var2.a <= 0) {
                    break;
                }
                if (x1Var2.b) {
                    rwVar.b -= i2;
                }
                rwVar.a = i - 1;
                x1 x1Var3 = x1Var2.c;
                rwVar.d = x1Var3;
                if (x1Var3 == null) {
                    rwVar.e = null;
                }
                x1Var2.c = (x1) q0Var.a;
                q0Var.a = x1Var2;
                i4 = i2;
            } else {
                i2 = i4;
                break;
            }
        }
        x1 x1Var4 = (x1) q0Var.a;
        if (x1Var4 == null) {
            x1Var4 = new x1();
        } else {
            q0Var.a = x1Var4.c;
        }
        x1Var4.a = j;
        x1Var4.b = z;
        x1Var4.c = null;
        x1 x1Var5 = (x1) rwVar.e;
        if (x1Var5 != null) {
            x1Var5.c = x1Var4;
        }
        rwVar.e = x1Var4;
        if (((x1) rwVar.d) == null) {
            rwVar.d = x1Var4;
        }
        rwVar.a = i + i2;
        if (z) {
            rwVar.b += i2;
        }
        rw rwVar2 = this.h;
        x1 x1Var6 = (x1) rwVar2.e;
        if (x1Var6 == null || (x1Var = (x1) rwVar2.d) == null || (i3 = rwVar2.a) < 4 || x1Var6.a - x1Var.a < 250000000 || rwVar2.b < (i3 >> 1) + (i3 >> 2)) {
            return;
        }
        while (true) {
            x1 x1Var7 = (x1) rwVar2.d;
            if (x1Var7 == null) {
                break;
            }
            rwVar2.d = x1Var7.c;
            q0 q0Var2 = (q0) rwVar2.c;
            x1Var7.c = (x1) q0Var2.a;
            q0Var2.a = x1Var7;
        }
        rwVar2.e = null;
        rwVar2.a = 0;
        rwVar2.b = 0;
        w1 w1Var = this.e;
        if (w1Var != null) {
            w1Var.b();
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
