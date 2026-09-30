package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class exe implements SensorEventListener {
    public final /* synthetic */ imb a;
    public final /* synthetic */ float[] b;
    public final /* synthetic */ float[] c;
    public final /* synthetic */ float[] d;
    public final /* synthetic */ jmb e;
    public final /* synthetic */ float f;
    public final /* synthetic */ jmb g;
    public final /* synthetic */ e89 h;

    public exe(imb imbVar, float[] fArr, float[] fArr2, float[] fArr3, jmb jmbVar, float f, jmb jmbVar2, e89 e89Var) {
        this.a = imbVar;
        this.b = fArr;
        this.c = fArr2;
        this.d = fArr3;
        this.e = jmbVar;
        this.f = f;
        this.g = jmbVar2;
        this.h = e89Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        sensorEvent.getClass();
        imb imbVar = this.a;
        boolean z = imbVar.element;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.b;
        if (!z) {
            SensorManager.getRotationMatrixFromVector(fArr2, fArr);
            imbVar.element = true;
            return;
        }
        float[] fArr3 = this.c;
        SensorManager.getRotationMatrixFromVector(fArr3, fArr);
        float[] fArr4 = this.d;
        SensorManager.getAngleChange(fArr4, fArr3, fArr2);
        float fN = mh3.n(fArr4[1], -0.4f, 0.4f);
        float fN2 = mh3.n(fArr4[2], -0.4f, 0.4f);
        jmb jmbVar = this.e;
        float f = jmbVar.element;
        float f2 = this.f;
        jmbVar.element = ((fN - f) * f2) + f;
        jmb jmbVar2 = this.g;
        float f3 = jmbVar2.element;
        float fA = ks0.a(fN2, f3, f2, f3);
        jmbVar2.element = fA;
        this.h.setValue(new fxe(jmbVar.element, fA));
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
