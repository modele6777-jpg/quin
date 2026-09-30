package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ls9 implements SensorEventListener {
    public final SensorManager a;
    public final Sensor b;
    public final s0e c;
    public final whb d;

    public ls9(Context context) {
        context.getClass();
        SensorManager sensorManager = (SensorManager) context.getSystemService(SensorManager.class);
        this.a = sensorManager;
        this.b = sensorManager != null ? sensorManager.getDefaultSensor(1) : null;
        s0e s0eVarA = t0e.a(Float.valueOf(0.0f));
        this.c = s0eVarA;
        this.d = if9.n(s0eVarA);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f;
        sensorEvent.getClass();
        if (sensorEvent.sensor.getType() != 1) {
            return;
        }
        float[] fArr = sensorEvent.values;
        float f2 = fArr[0];
        float f3 = fArr[1];
        if (Math.abs(f2) > Math.abs(f3) && f2 > 2.0f) {
            f = 90.0f;
        } else if (Math.abs(f2) <= Math.abs(f3) || f2 >= -2.0f) {
            f = f3 < -2.0f ? 180.0f : 0.0f;
        } else {
            f = -90.0f;
        }
        this.c.n(null, Float.valueOf(f));
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
