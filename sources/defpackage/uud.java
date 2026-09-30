package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uud extends GLSurfaceView {
    public static final /* synthetic */ int z = 0;
    public final CopyOnWriteArrayList a;
    public final SensorManager b;
    public final Sensor c;
    public final os9 d;
    public final Handler e;
    public final xec f;
    public SurfaceTexture g;
    public Surface v;
    public boolean w;
    public boolean x;
    public boolean y;

    public uud(Context context) {
        super(context, null);
        this.a = new CopyOnWriteArrayList();
        this.e = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        xec xecVar = new xec();
        this.f = xecVar;
        tud tudVar = new tud(this, xecVar);
        View.OnTouchListener v0fVar = new v0f(context, tudVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.d = new os9(windowManager.getDefaultDisplay(), v0fVar, tudVar);
        this.w = true;
        setEGLContextClientVersion(2);
        setRenderer(tudVar);
        setOnTouchListener(v0fVar);
    }

    public final void a() {
        boolean z2 = this.w && this.x;
        Sensor sensor = this.c;
        if (sensor == null || z2 == this.y) {
            return;
        }
        os9 os9Var = this.d;
        SensorManager sensorManager = this.b;
        if (z2) {
            sensorManager.registerListener(os9Var, sensor, 0);
        } else {
            sensorManager.unregisterListener(os9Var);
        }
        this.y = z2;
    }

    public zg1 getCameraMotionListener() {
        return this.f;
    }

    public guf getVideoFrameMetadataListener() {
        return this.f;
    }

    public Surface getVideoSurface() {
        return this.v;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.post(new m45(23, this));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.x = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.x = true;
        a();
    }

    public void setDefaultStereoMode(int i) {
        this.f.y = i;
    }

    public void setUseSensorRotation(boolean z2) {
        this.w = z2;
        a();
    }
}
