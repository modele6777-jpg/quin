package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class di6 {
    public static final lw7 a;
    public static final lw7 b;

    static {
        w66 w66Var = new w66(21);
        z18 z18Var = z18.c;
        a = eb3.N(z18Var, w66Var);
        b = eb3.N(z18Var, new w66(22));
    }

    public static final String a(boolean z) {
        return tec.m("\n  uniform shader content;\n  uniform float blurRadius;\n  uniform vec4 crop;\n  uniform shader mask;\n\n  const half maxRadius = 150.0;\n\n  float gaussian(float x, float sigma) {\n    return exp(-(x * x) / (2.0 * sigma * sigma));\n  }\n\n  vec4 blur(vec2 coord, float radius) {\n    // Truncate the radius\n    half r = floor(radius);\n\n    // Need to use float and vec here for higher precision, otherwise we see\n    // visually clipping on certain devices (Samsung for example)\n    // https://github.com/chrisbanes/haze/issues/520\n    float sigma = max(radius / 2.0, 1.0);\n    float weightSum = 1.0;\n    vec4 result = content.eval(coord);\n\n    // We need to use a constant max size Skia to know the size of the program. We use a large\n    // number, along with a break\n    for (half i = 1.0; i < maxRadius; i += 2.0) {\n      // i is always odd.\n      // The algorithm needs pixels exist at the offset of [i] (odd) and [i + 1] (even).\n      // If radius r is even (i > r), we can break safely here, as all the pixels have been calculated;\n      // otherwise (i == r) we need to calculate the pixel at the offset of [r], so break in advance.\n      if (i >= r) { break; }\n\n      float weightL = gaussian(i, sigma);\n      float weightH = gaussian(i + 1.0, sigma);\n      float weight = weightL + weightH;\n      vec2 offset = ", z ? "vec2(0.0, i + weightH / weight)" : "vec2(i + weightH / weight, 0.0)", ";\n\n      vec2 newCoord = coord - offset;\n      if (newCoord.x >= crop[0] && newCoord.y >= crop[1]) {\n        result += weight * content.eval(newCoord);\n        weightSum += weight;\n      }\n\n      newCoord = coord + offset;\n      if (newCoord.x < crop[2] && newCoord.y < crop[3]) {\n        result += weight * content.eval(newCoord);\n        weightSum += weight;\n      }\n    }\n\n    // Check if radius is odd\n    if (r < maxRadius && mod(r, 2.0) == 1.0) {\n      float weight = gaussian(r, sigma);\n      vec2 offset = ", z ? "vec2(0.0, r)" : "vec2(r, 0.0)", ";\n\n      vec2 newCoord = coord - offset;\n      if (newCoord.x >= crop[0] && newCoord.y >= crop[1]) {\n        result += weight * content.eval(newCoord);\n        weightSum += weight;\n      }\n\n      newCoord = coord + offset;\n      if (newCoord.x < crop[2] && newCoord.y < crop[3]) {\n        result += weight * content.eval(newCoord);\n        weightSum += weight;\n      }\n    }\n\n    return result / weightSum;\n  }\n\n  vec4 main(vec2 coord) {\n    // Offset the coord for the mask, but coerce it to be at least 0, 0\n    vec2 maskCoord = max(coord - crop.xy, vec2(0.0, 0.0));\n    float intensity = mask.eval(maskCoord).a;\n\n    return blur(coord, mix(0.0, blurRadius, intensity));\n  }\n");
    }
}
