cmake_minimum_required(VERSION 3.10)

project("increasing-array-cpp")

set(CMAKE_CXX_STANDARD 20)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

include_directories(include)

file(GLOB SOURCES "src/*.cpp")

add_executable(main ${SOURCES})

target_compile_options(main PRIVATE 
    -ggdb
    -Wall
    -Wextra
    -Weffc++
    -Wconversion
    -Wsign-conversion
    -Werror
    -pedantic-errors
    -O2
)

set_target_properties(main PROPERTIES
    RUNTIME_OUTPUT_DIRECTORY ${CMAKE_BINARY_DIR}/bin
    ARCHIVE_OUTPUT_DIRECTORY ${CMAKE_BINARY_DIR}/lib
    LIBRARY_OUTPUT_DIRECTORY ${CMAKE_BINARY_DIR}/lib
)
