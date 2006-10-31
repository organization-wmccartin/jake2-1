/*
Copyright (C) 1997-2001 Id Software, Inc.

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  

See the GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.

*/

// Created on 28.10.2006 by RST.

// $Id: GenericGL.java,v 1.1 2006-10-31 13:06:32 salomo Exp $

package jake2.render.common;

import java.nio.*;

/**
 * This is a class for wrapping lwjgl and jogl GL methods. 
 * It is not known if it performs well, but jit should know what we'Re doing.
 */
public interface GenericGL {

    public static final int GL_2_BYTES = 5127;
    public static final int GL_2D = 1536;
    public static final int GL_3_BYTES = 5128;
    public static final int GL_3D = 1537;
    public static final int GL_3D_COLOR = 1538;
    public static final int GL_3D_COLOR_TEXTURE = 1539;
    public static final int GL_4_BYTES = 5129;
    public static final int GL_4D_COLOR_TEXTURE = 1540;
    public static final int GL_ACCUM = 256;
    public static final int GL_ACCUM_ALPHA_BITS = 3419;
    public static final int GL_ACCUM_BLUE_BITS = 3418;
    public static final int GL_ACCUM_BUFFER_BIT = 512;
    public static final int GL_ACCUM_CLEAR_VALUE = 2944;
    public static final int GL_ACCUM_GREEN_BITS = 3417;
    public static final int GL_ACCUM_RED_BITS = 3416;
    public static final int GL_ADD = 260;
    public static final int GL_ALL_ATTRIB_BITS = 0xfffff;
    public static final int GL_ALL_CLIENT_ATTRIB_BITS = -1;
    public static final int GL_ALPHA = 6406;
    public static final int GL_ALPHA_BIAS = 3357;
    public static final int GL_ALPHA_BITS = 3413;
    public static final int GL_ALPHA_SCALE = 3356;
    public static final int GL_ALPHA_TEST = 3008;
    public static final int GL_ALPHA_TEST_FUNC = 3009;
    public static final int GL_ALPHA_TEST_REF = 3010;
    public static final int GL_ALPHA12 = 32829;
    public static final int GL_ALPHA16 = 32830;
    public static final int GL_ALPHA4 = 32827;
    public static final int GL_ALPHA8 = 32828;
    public static final int GL_ALWAYS = 519;
    public static final int GL_AMBIENT = 4608;
    public static final int GL_AMBIENT_AND_DIFFUSE = 5634;
    public static final int GL_AND = 5377;
    public static final int GL_AND_INVERTED = 5380;
    public static final int GL_AND_REVERSE = 5378;
    public static final int GL_ATTRIB_STACK_DEPTH = 2992;
    public static final int GL_AUTO_NORMAL = 3456;
    public static final int GL_AUX_BUFFERS = 3072;
    public static final int GL_AUX0 = 1033;
    public static final int GL_AUX1 = 1034;
    public static final int GL_AUX2 = 1035;
    public static final int GL_AUX3 = 1036;
    public static final int GL_BACK = 1029;
    public static final int GL_BACK_LEFT = 1026;
    public static final int GL_BACK_RIGHT = 1027;
    public static final int GL_BITMAP = 6656;
    public static final int GL_BITMAP_TOKEN = 1796;
    public static final int GL_BLEND = 3042;
    public static final int GL_BLEND_DST = 3040;
    public static final int GL_BLEND_SRC = 3041;
    public static final int GL_BLUE = 6405;
    public static final int GL_BLUE_BIAS = 3355;
    public static final int GL_BLUE_BITS = 3412;
    public static final int GL_BLUE_SCALE = 3354;
    public static final int GL_BYTE = 5120;
    public static final int GL_C3F_V3F = 10788;
    public static final int GL_C4F_N3F_V3F = 10790;
    public static final int GL_C4UB_V2F = 10786;
    public static final int GL_C4UB_V3F = 10787;
    public static final int GL_CCW = 2305;
    public static final int GL_CLAMP = 10496;
    public static final int GL_CLEAR = 5376;
    public static final int GL_CLIENT_ATTRIB_STACK_DEPTH = 2993;
    public static final int GL_CLIENT_PIXEL_STORE_BIT = 1;
    public static final int GL_CLIENT_VERTEX_ARRAY_BIT = 2;
    public static final int GL_CLIP_PLANE0 = 12288;
    public static final int GL_CLIP_PLANE1 = 12289;
    public static final int GL_CLIP_PLANE2 = 12290;
    public static final int GL_CLIP_PLANE3 = 12291;
    public static final int GL_CLIP_PLANE4 = 12292;
    public static final int GL_CLIP_PLANE5 = 12293;
    public static final int GL_COEFF = 2560;
    public static final int GL_COLOR = 6144;
    public static final int GL_COLOR_ARRAY = 32886;
    public static final int GL_COLOR_ARRAY_POINTER = 32912;
    public static final int GL_COLOR_ARRAY_SIZE = 32897;
    public static final int GL_COLOR_ARRAY_STRIDE = 32899;
    public static final int GL_COLOR_ARRAY_TYPE = 32898;
    public static final int GL_COLOR_BUFFER_BIT = 16384;
    public static final int GL_COLOR_CLEAR_VALUE = 3106;
    public static final int GL_COLOR_INDEX = 6400;
    public static final int GL_COLOR_INDEXES = 5635;
    public static final int GL_COLOR_LOGIC_OP = 3058;
    public static final int GL_COLOR_MATERIAL = 2903;
    public static final int GL_COLOR_MATERIAL_FACE = 2901;
    public static final int GL_COLOR_MATERIAL_PARAMETER = 2902;
    public static final int GL_COLOR_WRITEMASK = 3107;
    public static final int GL_COMPILE = 4864;
    public static final int GL_COMPILE_AND_EXECUTE = 4865;
    public static final int GL_CONSTANT_ALPHA = 32771;
    public static final int GL_CONSTANT_ATTENUATION = 4615;
    public static final int GL_CONSTANT_COLOR = 32769;
    public static final int GL_COPY = 5379;
    public static final int GL_COPY_INVERTED = 5388;
    public static final int GL_COPY_PIXEL_TOKEN = 1798;
    public static final int GL_CULL_FACE = 2884;
    public static final int GL_CULL_FACE_MODE = 2885;
    public static final int GL_CURRENT_BIT = 1;
    public static final int GL_CURRENT_COLOR = 2816;
    public static final int GL_CURRENT_INDEX = 2817;
    public static final int GL_CURRENT_NORMAL = 2818;
    public static final int GL_CURRENT_RASTER_COLOR = 2820;
    public static final int GL_CURRENT_RASTER_DISTANCE = 2825;
    public static final int GL_CURRENT_RASTER_INDEX = 2821;
    public static final int GL_CURRENT_RASTER_POSITION = 2823;
    public static final int GL_CURRENT_RASTER_POSITION_VALID = 2824;
    public static final int GL_CURRENT_RASTER_TEXTURE_COORDS = 2822;
    public static final int GL_CURRENT_TEXTURE_COORDS = 2819;
    public static final int GL_CW = 2304;
    public static final int GL_DECAL = 8449;
    public static final int GL_DECR = 7683;
    public static final int GL_DEPTH = 6145;
    public static final int GL_DEPTH_BIAS = 3359;
    public static final int GL_DEPTH_BITS = 3414;
    public static final int GL_DEPTH_BUFFER_BIT = 256;
    public static final int GL_DEPTH_CLEAR_VALUE = 2931;
    public static final int GL_DEPTH_COMPONENT = 6402;
    public static final int GL_DEPTH_FUNC = 2932;
    public static final int GL_DEPTH_RANGE = 2928;
    public static final int GL_DEPTH_SCALE = 3358;
    public static final int GL_DEPTH_TEST = 2929;
    public static final int GL_DEPTH_WRITEMASK = 2930;
    public static final int GL_DIFFUSE = 4609;
    public static final int GL_DITHER = 3024;
    public static final int GL_DOMAIN = 2562;
    public static final int GL_DONT_CARE = 4352;
    public static final int GL_DOUBLE = 5130;
    public static final int GL_DOUBLEBUFFER = 3122;
    public static final int GL_DRAW_BUFFER = 3073;
    public static final int GL_DRAW_PIXEL_TOKEN = 1797;
    public static final int GL_DST_ALPHA = 772;
    public static final int GL_DST_COLOR = 774;
    public static final int GL_EDGE_FLAG = 2883;
    public static final int GL_EDGE_FLAG_ARRAY = 32889;
    public static final int GL_EDGE_FLAG_ARRAY_POINTER = 32915;
    public static final int GL_EDGE_FLAG_ARRAY_STRIDE = 32908;
    public static final int GL_EMISSION = 5632;
    public static final int GL_ENABLE_BIT = 8192;
    public static final int GL_EQUAL = 514;
    public static final int GL_EQUIV = 5385;
    public static final int GL_EVAL_BIT = 0x10000;
    public static final int GL_EXP = 2048;
    public static final int GL_EXP2 = 2049;
    public static final int GL_EXTENSIONS = 7939;
    public static final int GL_EYE_LINEAR = 9216;
    public static final int GL_EYE_PLANE = 9474;
    public static final int GL_FALSE = 0;
    public static final int GL_FASTEST = 4353;
    public static final int GL_FEEDBACK = 7169;
    public static final int GL_FEEDBACK_BUFFER_POINTER = 3568;
    public static final int GL_FEEDBACK_BUFFER_SIZE = 3569;
    public static final int GL_FEEDBACK_BUFFER_TYPE = 3570;
    public static final int GL_FILL = 6914;
    public static final int GL_FLAT = 7424;
    public static final int GL_FLOAT = 5126;
    public static final int GL_FOG = 2912;
    public static final int GL_FOG_BIT = 128;
    public static final int GL_FOG_COLOR = 2918;
    public static final int GL_FOG_DENSITY = 2914;
    public static final int GL_FOG_END = 2916;
    public static final int GL_FOG_HINT = 3156;
    public static final int GL_FOG_INDEX = 2913;
    public static final int GL_FOG_MODE = 2917;
    public static final int GL_FOG_START = 2915;
    public static final int GL_FRONT = 1028;
    public static final int GL_FRONT_AND_BACK = 1032;
    public static final int GL_FRONT_FACE = 2886;
    public static final int GL_FRONT_LEFT = 1024;
    public static final int GL_FRONT_RIGHT = 1025;
    public static final int GL_GEQUAL = 518;
    public static final int GL_GREATER = 516;
    public static final int GL_GREEN = 6404;
    public static final int GL_GREEN_BIAS = 3353;
    public static final int GL_GREEN_BITS = 3411;
    public static final int GL_GREEN_SCALE = 3352;
    public static final int GL_HINT_BIT = 32768;
    public static final int GL_INCR = 7682;
    public static final int GL_INDEX_ARRAY = 32887;
    public static final int GL_INDEX_ARRAY_POINTER = 32913;
    public static final int GL_INDEX_ARRAY_STRIDE = 32902;
    public static final int GL_INDEX_ARRAY_TYPE = 32901;
    public static final int GL_INDEX_BITS = 3409;
    public static final int GL_INDEX_CLEAR_VALUE = 3104;
    public static final int GL_INDEX_LOGIC_OP = 3057;
    public static final int GL_INDEX_MODE = 3120;
    public static final int GL_INDEX_OFFSET = 3347;
    public static final int GL_INDEX_SHIFT = 3346;
    public static final int GL_INDEX_WRITEMASK = 3105;
    public static final int GL_INT = 5124;
    public static final int GL_INTENSITY = 32841;
    public static final int GL_INTENSITY12 = 32844;
    public static final int GL_INTENSITY16 = 32845;
    public static final int GL_INTENSITY4 = 32842;
    public static final int GL_INTENSITY8 = 32843;
    public static final int GL_INVALID_ENUM = 1280;
    public static final int GL_INVALID_OPERATION = 1282;
    public static final int GL_INVALID_VALUE = 1281;
    public static final int GL_INVERT = 5386;
    public static final int GL_KEEP = 7680;
    public static final int GL_LEFT = 1030;
    public static final int GL_LEQUAL = 515;
    public static final int GL_LESS = 513;
    public static final int GL_LIGHT_MODEL_AMBIENT = 2899;
    public static final int GL_LIGHT_MODEL_LOCAL_VIEWER = 2897;
    public static final int GL_LIGHT_MODEL_TWO_SIDE = 2898;
    public static final int GL_LIGHT0 = 16384;
    public static final int GL_LIGHT1 = 16385;
    public static final int GL_LIGHT2 = 16386;
    public static final int GL_LIGHT3 = 16387;
    public static final int GL_LIGHT4 = 16388;
    public static final int GL_LIGHT5 = 16389;
    public static final int GL_LIGHT6 = 16390;
    public static final int GL_LIGHT7 = 16391;
    public static final int GL_LIGHTING = 2896;
    public static final int GL_LIGHTING_BIT = 64;
    public static final int GL_LINE = 6913;
    public static final int GL_LINE_BIT = 4;
    public static final int GL_LINE_LOOP = 2;
    public static final int GL_LINE_RESET_TOKEN = 1799;
    public static final int GL_LINE_SMOOTH = 2848;
    public static final int GL_LINE_SMOOTH_HINT = 3154;
    public static final int GL_LINE_STIPPLE = 2852;
    public static final int GL_LINE_STIPPLE_PATTERN = 2853;
    public static final int GL_LINE_STIPPLE_REPEAT = 2854;
    public static final int GL_LINE_STRIP = 3;
    public static final int GL_LINE_TOKEN = 1794;
    public static final int GL_LINE_WIDTH = 2849;
    public static final int GL_LINE_WIDTH_GRANULARITY = 2851;
    public static final int GL_LINE_WIDTH_RANGE = 2850;
    public static final int GL_LINEAR = 9729;
    public static final int GL_LINEAR_ATTENUATION = 4616;
    public static final int GL_LINEAR_MIPMAP_LINEAR = 9987;
    public static final int GL_LINEAR_MIPMAP_NEAREST = 9985;
    public static final int GL_LINES = 1;
    public static final int GL_LIST_BASE = 2866;
    public static final int GL_LIST_BIT = 0x20000;
    public static final int GL_LIST_INDEX = 2867;
    public static final int GL_LIST_MODE = 2864;
    public static final int GL_LOAD = 257;
    public static final int GL_LOGIC_OP = 3057;
    public static final int GL_LOGIC_OP_MODE = 3056;
    public static final int GL_LUMINANCE = 6409;
    public static final int GL_LUMINANCE_ALPHA = 6410;
    public static final int GL_LUMINANCE12 = 32833;
    public static final int GL_LUMINANCE12_ALPHA12 = 32839;
    public static final int GL_LUMINANCE12_ALPHA4 = 32838;
    public static final int GL_LUMINANCE16 = 32834;
    public static final int GL_LUMINANCE16_ALPHA16 = 32840;
    public static final int GL_LUMINANCE4 = 32831;
    public static final int GL_LUMINANCE4_ALPHA4 = 32835;
    public static final int GL_LUMINANCE6_ALPHA2 = 32836;
    public static final int GL_LUMINANCE8 = 32832;
    public static final int GL_LUMINANCE8_ALPHA8 = 32837;
    public static final int GL_MAP_COLOR = 3344;
    public static final int GL_MAP_STENCIL = 3345;
    public static final int GL_MAP1_COLOR_4 = 3472;
    public static final int GL_MAP1_GRID_DOMAIN = 3536;
    public static final int GL_MAP1_GRID_SEGMENTS = 3537;
    public static final int GL_MAP1_INDEX = 3473;
    public static final int GL_MAP1_NORMAL = 3474;
    public static final int GL_MAP1_TEXTURE_COORD_1 = 3475;
    public static final int GL_MAP1_TEXTURE_COORD_2 = 3476;
    public static final int GL_MAP1_TEXTURE_COORD_3 = 3477;
    public static final int GL_MAP1_TEXTURE_COORD_4 = 3478;
    public static final int GL_MAP1_VERTEX_3 = 3479;
    public static final int GL_MAP1_VERTEX_4 = 3480;
    public static final int GL_MAP2_COLOR_4 = 3504;
    public static final int GL_MAP2_GRID_DOMAIN = 3538;
    public static final int GL_MAP2_GRID_SEGMENTS = 3539;
    public static final int GL_MAP2_INDEX = 3505;
    public static final int GL_MAP2_NORMAL = 3506;
    public static final int GL_MAP2_TEXTURE_COORD_1 = 3507;
    public static final int GL_MAP2_TEXTURE_COORD_2 = 3508;
    public static final int GL_MAP2_TEXTURE_COORD_3 = 3509;
    public static final int GL_MAP2_TEXTURE_COORD_4 = 3510;
    public static final int GL_MAP2_VERTEX_3 = 3511;
    public static final int GL_MAP2_VERTEX_4 = 3512;
    public static final int GL_MATRIX_MODE = 2976;
    public static final int GL_MAX_ATTRIB_STACK_DEPTH = 3381;
    public static final int GL_MAX_CLIENT_ATTRIB_STACK_DEPTH = 3387;
    public static final int GL_MAX_CLIP_PLANES = 3378;
    public static final int GL_MAX_EVAL_ORDER = 3376;
    public static final int GL_MAX_LIGHTS = 3377;
    public static final int GL_MAX_LIST_NESTING = 2865;
    public static final int GL_MAX_MODELVIEW_STACK_DEPTH = 3382;
    public static final int GL_MAX_NAME_STACK_DEPTH = 3383;
    public static final int GL_MAX_PIXEL_MAP_TABLE = 3380;
    public static final int GL_MAX_PROJECTION_STACK_DEPTH = 3384;
    public static final int GL_MAX_TEXTURE_SIZE = 3379;
    public static final int GL_MAX_TEXTURE_STACK_DEPTH = 3385;
    public static final int GL_MAX_VIEWPORT_DIMS = 3386;
    public static final int GL_MODELVIEW = 5888;
    public static final int GL_MODELVIEW_MATRIX = 2982;
    public static final int GL_MODELVIEW_STACK_DEPTH = 2979;
    public static final int GL_MODULATE = 8448;
    public static final int GL_MULT = 259;
    public static final int GL_N3F_V3F = 10789;
    public static final int GL_NAME_STACK_DEPTH = 3440;
    public static final int GL_NAND = 5390;
    public static final int GL_NEAREST = 9728;
    public static final int GL_NEAREST_MIPMAP_LINEAR = 9986;
    public static final int GL_NEAREST_MIPMAP_NEAREST = 9984;
    public static final int GL_NEVER = 512;
    public static final int GL_NICEST = 4354;
    public static final int GL_NO_ERROR = 0;
    public static final int GL_NONE = 0;
    public static final int GL_NOOP = 5381;
    public static final int GL_NOR = 5384;
    public static final int GL_NORMAL_ARRAY = 32885;
    public static final int GL_NORMAL_ARRAY_POINTER = 32911;
    public static final int GL_NORMAL_ARRAY_STRIDE = 32895;
    public static final int GL_NORMAL_ARRAY_TYPE = 32894;
    public static final int GL_NORMALIZE = 2977;
    public static final int GL_NOTEQUAL = 517;
    public static final int GL_OBJECT_LINEAR = 9217;
    public static final int GL_OBJECT_PLANE = 9473;
    public static final int GL_ONE = 1;
    public static final int GL_ONE_MINUS_CONSTANT_ALPHA = 32772;
    public static final int GL_ONE_MINUS_CONSTANT_COLOR = 32770;
    public static final int GL_ONE_MINUS_DST_ALPHA = 773;
    public static final int GL_ONE_MINUS_DST_COLOR = 775;
    public static final int GL_ONE_MINUS_SRC_ALPHA = 771;
    public static final int GL_ONE_MINUS_SRC_COLOR = 769;
    public static final int GL_OR = 5383;
    public static final int GL_OR_INVERTED = 5389;
    public static final int GL_OR_REVERSE = 5387;
    public static final int GL_ORDER = 2561;
    public static final int GL_OUT_OF_MEMORY = 1285;
    public static final int GL_PACK_ALIGNMENT = 3333;
    public static final int GL_PACK_LSB_FIRST = 3329;
    public static final int GL_PACK_ROW_LENGTH = 3330;
    public static final int GL_PACK_SKIP_PIXELS = 3332;
    public static final int GL_PACK_SKIP_ROWS = 3331;
    public static final int GL_PACK_SWAP_BYTES = 3328;
    public static final int GL_PASS_THROUGH_TOKEN = 1792;
    public static final int GL_PERSPECTIVE_CORRECTION_HINT = 3152;
    public static final int GL_PIXEL_MAP_A_TO_A = 3193;
    public static final int GL_PIXEL_MAP_A_TO_A_SIZE = 3257;
    public static final int GL_PIXEL_MAP_B_TO_B = 3192;
    public static final int GL_PIXEL_MAP_B_TO_B_SIZE = 3256;
    public static final int GL_PIXEL_MAP_G_TO_G = 3191;
    public static final int GL_PIXEL_MAP_G_TO_G_SIZE = 3255;
    public static final int GL_PIXEL_MAP_I_TO_A = 3189;
    public static final int GL_PIXEL_MAP_I_TO_A_SIZE = 3253;
    public static final int GL_PIXEL_MAP_I_TO_B = 3188;
    public static final int GL_PIXEL_MAP_I_TO_B_SIZE = 3252;
    public static final int GL_PIXEL_MAP_I_TO_G = 3187;
    public static final int GL_PIXEL_MAP_I_TO_G_SIZE = 3251;
    public static final int GL_PIXEL_MAP_I_TO_I = 3184;
    public static final int GL_PIXEL_MAP_I_TO_I_SIZE = 3248;
    public static final int GL_PIXEL_MAP_I_TO_R = 3186;
    public static final int GL_PIXEL_MAP_I_TO_R_SIZE = 3250;
    public static final int GL_PIXEL_MAP_R_TO_R = 3190;
    public static final int GL_PIXEL_MAP_R_TO_R_SIZE = 3254;
    public static final int GL_PIXEL_MAP_S_TO_S = 3185;
    public static final int GL_PIXEL_MAP_S_TO_S_SIZE = 3249;
    public static final int GL_PIXEL_MODE_BIT = 32;
    public static final int GL_POINT = 6912;
    public static final int GL_POINT_BIT = 2;
    public static final int GL_POINT_SIZE = 2833;
    public static final int GL_POINT_SIZE_GRANULARITY = 2835;
    public static final int GL_POINT_SIZE_RANGE = 2834;
    public static final int GL_POINT_SMOOTH = 2832;
    public static final int GL_POINT_SMOOTH_HINT = 3153;
    public static final int GL_POINT_TOKEN = 1793;
    public static final int GL_POINTS = 0;
    public static final int GL_POLYGON = 9;
    public static final int GL_POLYGON_BIT = 8;
    public static final int GL_POLYGON_MODE = 2880;
    public static final int GL_POLYGON_OFFSET_FACTOR = 32824;
    public static final int GL_POLYGON_OFFSET_FILL = 32823;
    public static final int GL_POLYGON_OFFSET_LINE = 10754;
    public static final int GL_POLYGON_OFFSET_POINT = 10753;
    public static final int GL_POLYGON_OFFSET_UNITS = 10752;
    public static final int GL_POLYGON_SMOOTH = 2881;
    public static final int GL_POLYGON_SMOOTH_HINT = 3155;
    public static final int GL_POLYGON_STIPPLE = 2882;
    public static final int GL_POLYGON_STIPPLE_BIT = 16;
    public static final int GL_POLYGON_TOKEN = 1795;
    public static final int GL_POSITION = 4611;
    public static final int GL_PROJECTION = 5889;
    public static final int GL_PROJECTION_MATRIX = 2983;
    public static final int GL_PROJECTION_STACK_DEPTH = 2980;
    public static final int GL_PROXY_TEXTURE_1D = 32867;
    public static final int GL_PROXY_TEXTURE_2D = 32868;
    public static final int GL_Q = 8195;
    public static final int GL_QUAD_STRIP = 8;
    public static final int GL_QUADRATIC_ATTENUATION = 4617;
    public static final int GL_QUADS = 7;
    public static final int GL_R = 8194;
    public static final int GL_R3_G3_B2 = 10768;
    public static final int GL_READ_BUFFER = 3074;
    public static final int GL_RED = 6403;
    public static final int GL_RED_BIAS = 3349;
    public static final int GL_RED_BITS = 3410;
    public static final int GL_RED_SCALE = 3348;
    public static final int GL_RENDER = 7168;
    public static final int GL_RENDER_MODE = 3136;
    public static final int GL_RENDERER = 7937;
    public static final int GL_REPEAT = 10497;
    public static final int GL_REPLACE = 7681;
    public static final int GL_RETURN = 258;
    public static final int GL_RGB = 6407;
    public static final int GL_RGB10 = 32850;
    public static final int GL_RGB10_A2 = 32857;
    public static final int GL_RGB12 = 32851;
    public static final int GL_RGB16 = 32852;
    public static final int GL_RGB4 = 32847;
    public static final int GL_RGB5 = 32848;
    public static final int GL_RGB5_A1 = 32855;
    public static final int GL_RGB8 = 32849;
    public static final int GL_RGBA = 6408;
    public static final int GL_RGBA_MODE = 3121;
    public static final int GL_RGBA12 = 32858;
    public static final int GL_RGBA16 = 32859;
    public static final int GL_RGBA2 = 32853;
    public static final int GL_RGBA4 = 32854;
    public static final int GL_RGBA8 = 32856;
    public static final int GL_RIGHT = 1031;
    public static final int GL_S = 8192;
    public static final int GL_SCISSOR_BIT = 0x80000;
    public static final int GL_SCISSOR_BOX = 3088;
    public static final int GL_SCISSOR_TEST = 3089;
    public static final int GL_SELECT = 7170;
    public static final int GL_SELECTION_BUFFER_POINTER = 3571;
    public static final int GL_SELECTION_BUFFER_SIZE = 3572;
    public static final int GL_SET = 5391;
    public static final int GL_SHADE_MODEL = 2900;
    public static final int GL_SHININESS = 5633;
    public static final int GL_SHORT = 5122;
    public static final int GL_SMOOTH = 7425;
    public static final int GL_SPECULAR = 4610;
    public static final int GL_SPHERE_MAP = 9218;
    public static final int GL_SPOT_CUTOFF = 4614;
    public static final int GL_SPOT_DIRECTION = 4612;
    public static final int GL_SPOT_EXPONENT = 4613;
    public static final int GL_SRC_ALPHA = 770;
    public static final int GL_SRC_ALPHA_SATURATE = 776;
    public static final int GL_SRC_COLOR = 768;
    public static final int GL_STACK_OVERFLOW = 1283;
    public static final int GL_STACK_UNDERFLOW = 1284;
    public static final int GL_STENCIL = 6146;
    public static final int GL_STENCIL_BITS = 3415;
    public static final int GL_STENCIL_BUFFER_BIT = 1024;
    public static final int GL_STENCIL_CLEAR_VALUE = 2961;
    public static final int GL_STENCIL_FAIL = 2964;
    public static final int GL_STENCIL_FUNC = 2962;
    public static final int GL_STENCIL_INDEX = 6401;
    public static final int GL_STENCIL_PASS_DEPTH_FAIL = 2965;
    public static final int GL_STENCIL_PASS_DEPTH_PASS = 2966;
    public static final int GL_STENCIL_REF = 2967;
    public static final int GL_STENCIL_TEST = 2960;
    public static final int GL_STENCIL_VALUE_MASK = 2963;
    public static final int GL_STENCIL_WRITEMASK = 2968;
    public static final int GL_STEREO = 3123;
    public static final int GL_SUBPIXEL_BITS = 3408;
    public static final int GL_T = 8193;
    public static final int GL_T2F_C3F_V3F = 10794;
    public static final int GL_T2F_C4F_N3F_V3F = 10796;
    public static final int GL_T2F_C4UB_V3F = 10793;
    public static final int GL_T2F_N3F_V3F = 10795;
    public static final int GL_T2F_V3F = 10791;
    public static final int GL_T4F_C4F_N3F_V4F = 10797;
    public static final int GL_T4F_V4F = 10792;
    public static final int GL_TEXTURE = 5890;
    public static final int GL_TEXTURE_1D = 3552;
    public static final int GL_TEXTURE_2D = 3553;
    public static final int GL_TEXTURE_ALPHA_SIZE = 32863;
    public static final int GL_TEXTURE_BINDING_1D = 32872;
    public static final int GL_TEXTURE_BINDING_2D = 32873;
    public static final int GL_TEXTURE_BIT = 0x40000;
    public static final int GL_TEXTURE_BLUE_SIZE = 32862;
    public static final int GL_TEXTURE_BORDER = 4101;
    public static final int GL_TEXTURE_BORDER_COLOR = 4100;
    public static final int GL_TEXTURE_COMPONENTS = 4099;
    public static final int GL_TEXTURE_COORD_ARRAY = 32888;
    public static final int GL_TEXTURE_COORD_ARRAY_POINTER = 32914;
    public static final int GL_TEXTURE_COORD_ARRAY_SIZE = 32904;
    public static final int GL_TEXTURE_COORD_ARRAY_STRIDE = 32906;
    public static final int GL_TEXTURE_COORD_ARRAY_TYPE = 32905;
    public static final int GL_TEXTURE_ENV = 8960;
    public static final int GL_TEXTURE_ENV_COLOR = 8705;
    public static final int GL_TEXTURE_ENV_MODE = 8704;
    public static final int GL_TEXTURE_GEN_MODE = 9472;
    public static final int GL_TEXTURE_GEN_Q = 3171;
    public static final int GL_TEXTURE_GEN_R = 3170;
    public static final int GL_TEXTURE_GEN_S = 3168;
    public static final int GL_TEXTURE_GEN_T = 3169;
    public static final int GL_TEXTURE_GREEN_SIZE = 32861;
    public static final int GL_TEXTURE_HEIGHT = 4097;
    public static final int GL_TEXTURE_INTENSITY_SIZE = 32865;
    public static final int GL_TEXTURE_INTERNAL_FORMAT = 4099;
    public static final int GL_TEXTURE_LUMINANCE_SIZE = 32864;
    public static final int GL_TEXTURE_MAG_FILTER = 10240;
    public static final int GL_TEXTURE_MATRIX = 2984;
    public static final int GL_TEXTURE_MIN_FILTER = 10241;
    public static final int GL_TEXTURE_PRIORITY = 32870;
    public static final int GL_TEXTURE_RED_SIZE = 32860;
    public static final int GL_TEXTURE_RESIDENT = 32871;
    public static final int GL_TEXTURE_STACK_DEPTH = 2981;
    public static final int GL_TEXTURE_WIDTH = 4096;
    public static final int GL_TEXTURE_WRAP_S = 10242;
    public static final int GL_TEXTURE_WRAP_T = 10243;
    public static final int GL_TRANSFORM_BIT = 4096;
    public static final int GL_TRIANGLE_FAN = 6;
    public static final int GL_TRIANGLE_STRIP = 5;
    public static final int GL_TRIANGLES = 4;
    public static final int GL_TRUE = 1;
    public static final int GL_UNPACK_ALIGNMENT = 3317;
    public static final int GL_UNPACK_LSB_FIRST = 3313;
    public static final int GL_UNPACK_ROW_LENGTH = 3314;
    public static final int GL_UNPACK_SKIP_PIXELS = 3316;
    public static final int GL_UNPACK_SKIP_ROWS = 3315;
    public static final int GL_UNPACK_SWAP_BYTES = 3312;
    public static final int GL_UNSIGNED_BYTE = 5121;
    public static final int GL_UNSIGNED_INT = 5125;
    public static final int GL_UNSIGNED_SHORT = 5123;
    public static final int GL_V2F = 10784;
    public static final int GL_V3F = 10785;
    public static final int GL_VENDOR = 7936;
    public static final int GL_VERSION = 7938;
    public static final int GL_VERTEX_ARRAY = 32884;
    public static final int GL_VERTEX_ARRAY_POINTER = 32910;
    public static final int GL_VERTEX_ARRAY_SIZE = 32890;
    public static final int GL_VERTEX_ARRAY_STRIDE = 32892;
    public static final int GL_VERTEX_ARRAY_TYPE = 32891;
    public static final int GL_VIEWPORT = 2978;
    public static final int GL_VIEWPORT_BIT = 2048;
    public static final int GL_XOR = 5382;
    public static final int GL_ZERO = 0;
    public static final int GL_ZOOM_X = 3350;
    public static final int GL_ZOOM_Y = 3351;


	void glActiveTextureARB(int texture);
	void glBegin(int gl_triangle_fan2);
	void glBindTexture(int gl_texture_2d2, int texnum);
	void glBlendFunc(int gl_src_alpha2, int gl_one_minus_src_alpha2);
	void glClear(int gl_color_buffer_bit2);
	void glClearColor(float f, float g, float h, float i);
	void glClientActiveTextureARB(int texture);
	void glColor3f(float f, float g, float h);
	void glColor3ub(byte b, byte c, byte d);
	void glColor4f(float intens, float intens2, float intens3, float f);
	void glColor4f(int i, int j, int k, float f);
	void glColor4ub(byte b, byte c, byte d, byte e);
	void glColorPointer(int i, int gl_float2, int j, FloatBuffer colorArrayBuf);
	void glColorPointer(int i, int gl_unsigned_byte2, int j, ByteBuffer bb);
	void glCullFace(int gl_back2);
	void glDepthFunc(int gl_lequal2);
	void glDepthMask(boolean b);
	void glDepthRange(float gldepthmin, double d);
	void glDisable(int gl_texture_2d2);
	void glDisableClientState(int gl_color_array2);
	void glDrawArrays(int gl_polygon2, int pos, int numverts);
	void glDrawElements(int mode, int count, int gl_unsigned_int2, IntBuffer srcIndexBuf);
	void glEnable(int gl_alpha_test2);
	void glEnableClientState(int gl_color_array2);
	void glEnd();
	void glFrustum(double xmin, double xmax, double ymin, double ymax, double near, double far);
	void glInterleavedArrays(int gl_t2f_v3f2, int byte_stride, FloatBuffer globalPolygonInterleavedBuf);
	void glLoadIdentity();
	void glLoadMatrixf(float[] r_world_matrix);
	void glMatrixMode(int gl_projection2);
	void glOrtho(int i, int width, int height, int j, int k, int l);
	void glPointSize(float value);
	void glPopMatrix();
	void glPushMatrix();
	void glRotatef(float f, float g, float h, float i);
	void glScalef(int i, int j, int k);
	void glShadeModel(int gl_smooth2);
	void glTexCoord2f(float s, float t);
	void glTexCoordPointer(int i, int gl_float2, int j, FloatBuffer textureArrayBuf);
	void glTexEnvi(int gl_texture_env2, int gl_texture_env_mode2, int mode);
	void glTexImage2D(int gl_texture_2d2, int i, int gl_color_index8_ext, int j, int k, int l, int gl_color_index2, int gl_unsigned_byte2, ByteBuffer image8);
	void glTexImage2D(int gl_texture_2d2, int i, int gl_tex_solid_format, int j, int k, int l, int gl_rgba3, int gl_unsigned_byte2, IntBuffer image32);
	void glTexParameterf(int gl_texture_2d, int gl_texture_min_filter, int gl_nearest);
	void glTexParameteri(int gl_texture_2d2, int gl_texture_min_filter2, int gl_filter_min);
	void glTexSubImage2D(int gl_texture_2d2, int i, int j, int k, int lm_block_width, int height, int gl_lightmap_format, int gl_unsigned_byte2, IntBuffer lightmap_buffer);
	void glTranslatef(float f, float g, float h);
	void glVertex2f(int x, int i);
	void glVertex3f(float f, float g, float h);
	void glVertexPointer(int i, int gl_float2, int j, FloatBuffer vertexArrayBuf);
	void glViewport(int i, int j, int width, int height);
}
